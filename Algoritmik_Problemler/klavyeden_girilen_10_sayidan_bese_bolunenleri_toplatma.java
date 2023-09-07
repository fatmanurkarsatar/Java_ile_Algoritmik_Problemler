package Algoritmik_Problemler;

import java.util.Scanner;

public class klavyeden_girilen_10_sayidan_bese_bolunenleri_toplatma {
    public static void main(String[] args) {

        //klavyeden girilen 10 sayıdan 5 e bölünenlerin
        // toplamını veren java kodu

        Scanner scan = new Scanner(System.in);

        int toplam =0;

        for(int i=0;i<=10;i++){
            System.out.println("Sayı giriniz:");
            int sayi = scan.nextInt();
            if(sayi%5==0){
                toplam += sayi;
            }
        }
        System.out.println("beşe bölünen sayıların toplamı = " + toplam);

    }
}
