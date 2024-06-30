package com.imgapi.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.management.RuntimeErrorException;

public class DataUrls {
    public StringBuffer getResponseData()throws IOException{
        String url = "https://api.unsplash.com/photos/random?client_id=O0YLZWw_GSTLKzx0UsRwqps1DjW7Cb_3P5TZW4NN4Qw";
        
        HttpURLConnection httpClient = (HttpURLConnection) new URL(url).openConnection();
        httpClient.setRequestMethod("GET");

        StringBuffer response = new StringBuffer();

        int responseCode = httpClient.getResponseCode();

        if(responseCode == HttpURLConnection.HTTP_OK){
            BufferedReader in = new BufferedReader(new InputStreamReader(httpClient.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response;

        }else{
            throw new RuntimeErrorException(null, "Get request failed with response code " + responseCode);
        }
    }
}
