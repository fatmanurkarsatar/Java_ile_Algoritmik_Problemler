package Algoritmik_Problemler;

import java.util.Scanner;

public class dikdortgenin_alanini_ve_cevresini_buldurma {
    public static void main(String[] args) {

        //dışardan girilen verilerle dikdörtgenin çevresini
        //ve alanını bulan java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("dikdörtgenin uzun kenarını giriniz:");
        int uzke = scan.nextInt();

        System.out.println("dikdörtgenin kısa kenarını giriniz:");
        int Kike = scan.nextInt();

        alanHesapla(uzke,Kike);
        cevreHesapla(uzke,Kike);

    }

    public static void alanHesapla(int uk, int Kk){
        int alan = uk*Kk;
        System.out.println("dikdörtgenin alanı = " + alan);
    }

    public static void cevreHesapla(int uk, int Kk){
        int cevre = 2*(uk+Kk);
        System.out.println("dikdörtgenin çevresi = " + cevre);
    }
}
