package com.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Player Info");

        PlayerData pd = new PlayerData();

        pd.setPlayerName("Rohit");
        pd.setCountry("India");
        pd.setJersyNo(45);

        System.out.println("Player Name :" + pd.getPlayerName());
        System.out.println("Country Name : "+ pd.getCountry());
        System.out.println("Jersy No. : " + pd.getJersyNo());

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Player Name:");
        String playerName = sc.next();

        System.out.println("Entry Country Name: ");
        String countryname = sc.next();

        System.out.println("Enter Jersy No. : ");
        int jersyno = sc.nextInt();

        pd = new PlayerData();
        pd.setCountry(countryname);
        pd.setJersyNo(jersyno);
        pd.setPlayerName(playerName);

        System.out.println("Player Name :" + pd.getPlayerName());
        System.out.println("Country Name : "+ pd.getCountry());
        System.out.println("Jersy No. : " + pd.getJersyNo());
    }
}