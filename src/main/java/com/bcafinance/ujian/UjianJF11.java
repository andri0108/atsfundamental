package com.bcafinance.ujian;

import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class UjianJF11 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        String[] pertama = {"628", "08"};
        String[] provider = {"12", "13", "57", "56", "52"};

        System.out.print("Jumlah data nomer handphone yang ingin di generate : ");
        int jumlah = sc.nextInt();
        for (int i = 0; i < jumlah; i++) {
            StringBuilder tigaDigit = new StringBuilder();
            StringBuilder terakhir = new StringBuilder();

            int a = random.nextInt(0, 2);
            int b = random.nextInt(3, 5);
            int c = random.nextInt(10, 14);
            for (int j = 0; j < 3; j++) {
                int nomer = random.nextInt(14);
                tigaDigit.append(nomer);
            }
            for (int k = 0; k < b; k++) {
                int nomer = random.nextInt(14);
                terakhir.append(nomer);
            }

            String hasil = pertama[a] + provider[b] + "-" + tigaDigit + "-" + terakhir;
            System.out.println(hasil);
            tigaDigit.setLength(0);
            terakhir.setLength(0);
        }
    }

}







