package Algoritmik_Problemler;

import java.util.Scanner;

public class ucgen_alan_cevre_hesaplama {
    public static void main(String[] args) {

        //kısa ve uzun kenarı girilen üçgenin alanını hesaplayan java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("üçgenin uzun kenarını giriniz: ");
        int Uk = scan.nextInt();

        System.out.println("üçgenin kısa kenarını giriniz: ");
        int Kk = scan.nextInt();

        double UcgenAlan = ((Uk * Kk) / 2);

        System.out.println("üçgenin alanı = " + UcgenAlan);


    }
}
