package Algoritmik_Problemler;

import java.util.Scanner;

public class girilen_20_sayinin_cifttoplam_tektoplamini_buldurma {
    public static void main(String[] args) {

        //dışardan girilen 20 sayıdan çiftlerin ve
        // teklerin toplamını bulan java kodu

        int cifttoplam = 0;
        int tektoplam=0;

        for(int i=0;i<=20;i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Sayı giriniz:");
            int sayi = scan.nextInt();
            if(sayi%2==0){
                cifttoplam+=sayi;
            }else{
                tektoplam+=sayi;
            }
        }
        System.out.println("çift sayıların toplamı = " + cifttoplam);
        System.out.println("tek sayıların toplamı = " + tektoplam);

    }
}
