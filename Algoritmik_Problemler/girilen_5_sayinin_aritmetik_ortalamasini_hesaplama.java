package Algoritmik_Problemler;

import java.util.Scanner;

public class girilen_5_sayinin_aritmetik_ortalamasini_hesaplama {
    public static void main(String[] args) {

        //girilen 5 sayının aritmetik ortalamasını bulan java kod

        int toplam=0;

        for(int i=0;i<5;i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("sayı giriniz:");
            int sayi = scan.nextInt();
            toplam +=sayi;


        }
        float ort = (float) (toplam / 5);
        System.out.println("ortalama = " + ort);
    }
}
