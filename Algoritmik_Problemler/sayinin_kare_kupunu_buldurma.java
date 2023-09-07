package Algoritmik_Problemler;

import java.util.Scanner;

public class sayinin_kare_kupunu_buldurma {
    public static void main(String[] args) {

        //girilen sayıya kadar olan tüm sayıların karelerini
        //ve küplerinin yazdıran java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();


        for (int i = 1; i <= sayi; i++) {
            int kare = i * i;
            int kup = i * i * i;

            System.out.println(i+ " in karesi = " + kare);
            System.out.println(i+ " in küpü = " + kup);
        }
    }
}
