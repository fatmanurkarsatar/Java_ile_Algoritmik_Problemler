package Algoritmik_Problemler;

import java.util.Scanner;

public class klavyeden_girilen_10_sayinin_ortalamasini_buldurma {
    public static void main(String[] args) {

        //dışardan girilen 10 sayının ortalamasını bulan kod

        int toplam = 0;

        double average = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("sayı giriniz:");
            Scanner scan = new Scanner(System.in);
            int sayi = scan.nextInt();
            toplam += sayi;
            average = toplam / i;
        }
        System.out.println("ortalama = " + average);

    }

}
