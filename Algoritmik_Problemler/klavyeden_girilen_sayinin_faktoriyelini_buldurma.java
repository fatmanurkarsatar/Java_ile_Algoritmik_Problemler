package Algoritmik_Problemler;

import java.util.Scanner;

public class klavyeden_girilen_sayinin_faktoriyelini_buldurma {
    public static void main(String[] args) {

        //klavyeden girilen sayının faktoriyelini hesaplayan java kodu

        Scanner scan = new Scanner(System.in);

        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();
        int sonuc = hesapla(sayi);
        System.out.println(sayi + " in faktöriyeli = " + sonuc);

    }

    public static int hesapla(int sayi) {
        int sonuc = 1;
        for (int i = sayi; i >= 1; i--) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }
}


