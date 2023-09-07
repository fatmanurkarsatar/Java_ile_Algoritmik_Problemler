package Algoritmik_Problemler;

import java.util.Scanner;

public class istenilen_sart_kadar_string_yazdirma {
    public static void main(String[] args) {

        //girilen sayı 6 nın katıysa konsola sayı kadar
        // Hello planets yazan java kodu

        int sayac=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();

        for(int i=1;i<=sayi;i++){
            if(sayi%6==0){
                System.out.println("Hello planets");
                sayac++;
            }

        }
        System.out.println();

    }
}
