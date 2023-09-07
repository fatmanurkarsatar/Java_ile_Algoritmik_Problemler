package Algoritmik_Problemler;

import java.util.Scanner;

public class istenilen_sart_kadar_faktoriyel_hesaplama {
    public static void main(String[] args) {

        //klavyeden girilen sayıya kadar olan sayıların
        //faktöriyelini hesaplayan java kodu

        System.out.println("kaça kadar olan sayıların faktöriyelini hesaplayalım ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        for(int i=1;i<=sayi;i++){
            faktoriyelHesapla(i);
        }
    }



    public static void faktoriyelHesapla(int s1) {
        int faktoriyel = 1;
        for (int i = 1; i <= s1; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(s1 + " in faktöriyeli " + faktoriyel);
    }


}