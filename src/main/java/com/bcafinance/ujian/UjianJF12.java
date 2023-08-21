package com.bcafinance.ujian;

import java.util.Random;
import java.util.Scanner;

public class UjianJF12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the number of random email addresses to generate: ");
        int numEmails = scanner.nextInt();

        for (int i = 0; i < numEmails; i++) {
            String email = generateRandomEmail(rand);
            System.out.println("Random Email Address " + (i + 1) + ": " + email);
        }

        scanner.close();
    }
    public static String generateRandomEmail(Random rand) {
        String[] providers = { "gmail", "ymail", "rocketmail", "yahoo" };
        String[] domains = { "com", "co.id", "us", "id", "jp" };

        String username = generateRandomString(rand, 6); // Generate a random username of length 6
        String domain = domains[rand.nextInt(domains.length)];
        String provider = providers[rand.nextInt(providers.length)];

        return username + "@" + provider+"."+domain;
    }

    public static String generateRandomString(Random rand, int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder strBuilder = new StringBuilder(length);


        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(allowedChars.length());
            char randomChar = allowedChars.charAt(index);
            strBuilder.append(randomChar);
        }

        return strBuilder.toString();
    }
}





