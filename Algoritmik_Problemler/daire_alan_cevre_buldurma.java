package Algoritmik_Problemler;

import java.util.Scanner;

public class daire_alan_cevre_buldurma {
    public static void main(String[] args) {

        //yarı çapı girilen dairenin alanını ve çevresini
        //hesaplayan java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("yarıçap değerini giriniz:");
        int yaricap = scan.nextInt();

        daireAlan(yaricap);
        daireCevreHesapla(yaricap);

    }
    public static void daireAlan(int yr){
        double pi = 3.14;
        double alan = (pi*(yr*yr));
        System.out.println("dairenin alanı = " + alan);
    }

    public static void daireCevreHesapla(int yr){
        double pi = 3.14;
        double cevre = (2*pi*yr);
        System.out.println("dairenin çevresi = " + cevre);
    }
}
