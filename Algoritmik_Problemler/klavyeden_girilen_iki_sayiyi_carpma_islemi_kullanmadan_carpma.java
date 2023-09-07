package Algoritmik_Problemler;

import java.util.Scanner;

public class klavyeden_girilen_iki_sayiyi_carpma_islemi_kullanmadan_carpma {
    public static void main(String[] args) {

        //klavyeden girilen iki sayının çarpımını çarpma
        // işlemi kullanmadan yapan java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int sayi = scan.nextInt();

        System.out.println("bir sayı daha giriniz: ");
        int sayi2 = scan.nextInt();


        carpma(sayi,sayi2);
    }

    public static void carpma(int sayi, int sayi2){
        int toplam=0;
        for(int i=1;i<=sayi;i++){
            toplam += sayi2;

        }
        System.out.println("toplam = " + toplam);
    }
    }
