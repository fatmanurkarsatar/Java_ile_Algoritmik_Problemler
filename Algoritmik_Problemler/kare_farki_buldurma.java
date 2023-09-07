package Algoritmik_Problemler;

import java.util.Scanner;

public class kare_farki_buldurma {
    public static void main(String[] args) {

        //girilen iki sayının karelerinin farkını veren java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();

        System.out.println("bir sayı daha giriniz:");
        int sayi2 = scan.nextInt();

        KareFark(sayi,sayi2);

    }
    public static void KareFark(int s1, int s2){
        int karefarki = ((s1*s1)-(s2*s2));
        if(karefarki>0){
            System.out.println("pozitif fark");
        }else if(karefarki==0){
            System.out.println("sonuç sıfıra eşit");
        }else{
            System.out.println("negatif fark");
        }
        System.out.println("kare farkı = " + karefarki);
    }


}
