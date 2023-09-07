package Algoritmik_Problemler;

import java.util.Scanner;

public class istenilen_sarta_kadar_girilen_sayilarin_carpimini_buldurma {
    public static void main(String[] args) {

        //klavyeden 0 girilene kadar girilen
        // sayıların çarpımını ekrana yazdıran java kodu

        System.out.println("sayı giriniz:");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int carpim=1;

        while(sayi!=0){
            carpim = carpim * sayi;
            System.out.println("bir sayı daha giriniz:");
            Scanner scan2 = new Scanner(System.in);
            sayi = scan2.nextInt();
        }
        System.out.println("girilen sayıların çarpımı = " + carpim);

    }
}
