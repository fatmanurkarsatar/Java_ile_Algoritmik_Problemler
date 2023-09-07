package Algoritmik_Problemler;

import java.util.Scanner;

public class _10_sayidan_en_kücügünü_buldurma {
    public static void main(String[] args) {

        //klavyeden girilen 10 sayıdan en küçük sayıyı yazdıran java kodu

        int kucuk = 0;
        for(int i=1;i<=10;i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("bir sayı giriniz:");
            int sayi = scan.nextInt();

            if(i==1){
                kucuk = sayi;
            }
            if(kucuk>sayi){
                kucuk = sayi;
            }
        }
        System.out.println("küçük sayı = " + kucuk);
    }
}
