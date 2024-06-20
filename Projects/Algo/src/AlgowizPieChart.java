import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlgowizPieChart extends Application {
    private PieChart c2w_chart;
    private ListView<String> c2w_sortingListView;
    private Label c2w_bubbleSortLabel;
    private Label c2w_selectionSortLabel;
    private Label c2w_insertionSortLabel;
    private Label c2w_quickSortLabel;
    private Label c2w_mergeSortLabel;
    private HBox hb_listView, noteBox;
    private Button startButton;
    private Map<String, Double> sortingTimes = new HashMap<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sorting Time C2w_chart");
        Image logoImage = new Image("file:/src/core2web1.png");
        ImageView logoView = new ImageView(logoImage);
        logoView.setFitHeight(80);
        logoView.setPreserveRatio(true);

        Label descriptionNoteLabel = new Label("The algorithms process 90000 randomly generated data. Based on that data sorting time, the Pie c2w_chart is constructed.");
        noteBox = new HBox(descriptionNoteLabel);
        noteBox.setAlignment(Pos.CENTER);
        noteBox.setDisable(true);

        c2w_chart = new PieChart();
        c2w_chart.setTitle("Sorting Algorithm Time Comparison");

        c2w_bubbleSortLabel = createLabel("Bubble Sort: ");
        c2w_quickSortLabel = createLabel("Quick Sort: ");
        c2w_insertionSortLabel = createLabel("Insertion Sort: ");
        c2w_selectionSortLabel = createLabel("Selection Sort: ");
        c2w_mergeSortLabel = createLabel("Merge Sort: ");

        c2w_sortingListView = new ListView<>();
        c2w_sortingListView.setPrefSize(450, 200);
        c2w_sortingListView.setStyle("-fx-font-family: 'Times New Roman';-fx-alignment: CENTER; -fx-font-weight:bold;-fx-font-size:22");

        hb_listView = new HBox(c2w_sortingListView);
        hb_listView.setDisable(true);
        hb_listView.setAlignment(Pos.CENTER);

        startButton = new Button("Start Calculations");
        startButton.setOnAction(event -> startCalculations());

        HBox buttonHBox = new HBox(startButton);
        buttonHBox.setPadding(new Insets(50));
        buttonHBox.setAlignment(Pos.BASELINE_CENTER);

        VBox vBox = new VBox(logoView, c2w_chart, noteBox, hb_listView, buttonHBox);
        vBox.setPadding(new Insets(10));

        Scene scene = new Scene(vBox, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Label createLabel(String text) {
        Label label = new Label(text);
        label.setStyle("-fx-text-fill:black;-fx-font-weight:bold;-fx-font-size:22");
        return label;
    }

    private void startCalculations() {
        hb_listView.setDisable(false);
        noteBox.setDisable(false);
        c2w_chart.getData().clear();
        c2w_sortingListView.getItems().clear();
        sortingTimes.clear();

        Task<Void> bubbleSortTask = createSortingTask("Bubble Sort", this::bubbleSort);
        Task<Void> quickSortTask = createSortingTask("Quick Sort", (data) -> quickSort(data, 0, data.length - 1));
        Task<Void> selectionSortTask = createSortingTask("Selection Sort", this::selectionSort);
        Task<Void> insertionSortTask = createSortingTask("Insertion Sort", this::insertionSort);
        Task<Void> mergeSortTask = createSortingTask("Merge Sort", (data) -> mergeSort(data, 0, data.length - 1));

        c2w_bubbleSortLabel.textProperty().bind(bubbleSortTask.messageProperty());
        c2w_quickSortLabel.textProperty().bind(quickSortTask.messageProperty());
        c2w_selectionSortLabel.textProperty().bind(selectionSortTask.messageProperty());
        c2w_insertionSortLabel.textProperty().bind(insertionSortTask.messageProperty());
        c2w_mergeSortLabel.textProperty().bind(mergeSortTask.messageProperty());

        List<Task<Void>> sortingTasks = Arrays.asList(bubbleSortTask, quickSortTask, selectionSortTask, insertionSortTask, mergeSortTask);
        sortingTasks.forEach(task -> {
            Thread thread = new Thread(task);
            thread.setDaemon(true);
            thread.start();
        });

        startButton.setText("Restart");
    }

    private Task<Void> createSortingTask(String algorithmName, SortingAlgorithm sortingAlgorithm) {
        return new Task<Void>() {
            @Override
            protected Void call() {
                int[] data = generateRandomData(90000);
                long startTime = System.nanoTime();
                sortingAlgorithm.sort(data);
                long endTime = System.nanoTime();
                double elapsedTimeInSeconds = (endTime - startTime) / 1e9;
                Platform.runLater(() -> {
                    updateMessage(algorithmName + ": " + elapsedTimeInSeconds + " seconds");
                    updateChartData(algorithmName, elapsedTimeInSeconds);
                });
                return null;
            }
        };
    }

    private void updateChartData(String algorithmName, double timeInSeconds) {
        Platform.runLater(() -> {
            sortingTimes.put(algorithmName, timeInSeconds);

            c2w_chart.getData().clear();
            sortingTimes.forEach((key, value) -> {
                PieChart.Data data = new PieChart.Data(key, value);
                c2w_chart.getData().add(data);
            });

            c2w_sortingListView.getItems().clear();
            sortingTimes.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> {
                    String formattedTime = String.format("%.6f seconds", entry.getValue());
                    c2w_sortingListView.getItems().add(String.format("%-20s: %s", entry.getKey(), formattedTime));
                });
        });
    }

    private int[] generateRandomData(int size) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(90000);
        }
        return data;
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    private void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    private void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public interface SortingAlgorithm {
        void sort(int[] arr);
    }
}
