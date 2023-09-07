package Algoritmik_Problemler;

import java.util.Scanner;

public class klavyeden_girilen_sayidan_geriye_dogru_olan_sayilari_buldurma {
    public static void main(String[] args) {

        //ekrana girilen pozitif sayıdan başlayıp 1'e kadar olan
        //sayıları ekrana yazan java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();

        for(int i=sayi;i>=1;i--){
                System.out.println(i);
            }
        }
    }

