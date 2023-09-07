package Algoritmik_Problemler;

import java.util.Scanner;

public class _10_sayidan_en_buyugunu_buldurma {
    public static void main(String[] args) {

        // klavyeden girilen 10 sayıdan en büyüğünü bulduran java kodu

        int buyuk=0;
        for(int i = 1;i<=10;i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("bir sayı giriniz:");
            int sayi = scan.nextInt();

            if(sayi<0){
                buyuk=sayi;
            }

            if(buyuk<sayi){
                buyuk = sayi;
            }
        }
        System.out.println("büyük sayı = " + buyuk);
    }
}
