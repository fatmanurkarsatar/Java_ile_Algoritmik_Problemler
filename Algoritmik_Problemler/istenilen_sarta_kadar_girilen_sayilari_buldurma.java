package Algoritmik_Problemler;

import java.util.Scanner;

public class istenilen_sarta_kadar_girilen_sayilari_buldurma {
    public static void main(String[] args) {

        //dışardan girilen sayıların toplamı 110 dan fazla olduğunda
        //kaç adet sayı girildiğini hesaplayan java kodu

        int toplam = 0;
        int sayac=0;


       while(toplam<=110){
           Scanner scan = new Scanner(System.in);
           System.out.println("sayı giriniz:");
           int sayi = scan.nextInt();
           toplam = toplam + sayi;
           sayac++;
       }
        System.out.println("girilen sayı adedi = " + sayac);
    }
}
