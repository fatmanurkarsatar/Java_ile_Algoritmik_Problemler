package Algoritmik_Problemler;

import java.util.Scanner;

public class istenilen_sarta_kadar_girilen_sayilari_toplatma {
    public static void main(String[] args) {

        //klavyeden -1 girilene kadar girilen
        // sayıların toplamını bulan java kodu

        System.out.println("sayı giriniz:");
        Scanner scan = new Scanner(System.in);
        int deger = scan.nextInt();
        int toplam = 0;

        while(deger!=-1){
            System.out.println("girdi");

            toplam = toplam+deger;
            System.out.println("sayı girmeye devam et:");
            Scanner scan1 = new Scanner(System.in);
            deger = scan1.nextInt();
        }
        System.out.println("girilen sayıların toplamı = " + toplam);

    }
}
