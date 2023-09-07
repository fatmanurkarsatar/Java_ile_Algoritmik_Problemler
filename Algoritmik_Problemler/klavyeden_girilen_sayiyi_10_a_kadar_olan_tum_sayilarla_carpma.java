package Algoritmik_Problemler;

import java.util.Scanner;

public class klavyeden_girilen_sayiyi_10_a_kadar_olan_tum_sayilarla_carpma {
    public static void main(String[] args) {

        //klavyeden girilen sayının 10 a kadar tüm
        //sayılarla çarpımını yapan java kod

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi = scan.nextInt();


        for(int i=1;i<=10;i++){
            System.out.println(sayi+"x"+i+"="+(sayi*i));
        }

    }
}
