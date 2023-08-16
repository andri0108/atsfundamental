package com.bcafinance.praktikum;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class day3 {
    public static void main(String[] args) {

        String Speed = "";
        int Jumlah =0;
        int asc;
        System.out.print("Masukkan Kata : ");
        Scanner scanner = new Scanner(System.in);
        Speed = scanner.nextLine();
        char [] chArr =Speed.toCharArray();
        for (int i=0;i<chArr.length;i++){
            asc=chArr[i];
            if ((asc>=65&&asc<=90)||(asc>=97&&asc<=122)){
                Jumlah += asc;
            }
        }
        System.out.println(Jumlah);

        }
    }
