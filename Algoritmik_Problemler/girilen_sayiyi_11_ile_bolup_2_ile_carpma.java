package Algoritmik_Problemler;

import java.util.Scanner;

public class girilen_sayiyi_11_ile_bolup_2_ile_carpma {
    public static void main(String[] args) {

        //klavyeden girilen sayıyı 11 ile bölüp
        //2 ile çarpan java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        double sayi = scan.nextDouble();

        double islem = (sayi/11)*2;
        System.out.println("işlemin sonucu = " + islem);
    }
}
