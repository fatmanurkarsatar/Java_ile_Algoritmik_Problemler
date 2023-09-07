package Algoritmik_Problemler;

import java.util.Random;
import java.util.Scanner;

public class istenilen_aralikta_rastgele_sayi_olusturma {
    public static void main(String[] args) {

        // -1 ile girdiğin sayı arasında rastgele sayı oluşturan java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();

        Random rn = new Random();
        int s1 = rn.nextInt(sayi)+1; //sayı ve 1 de dahil demek

        System.out.println(s1);
    }
}
