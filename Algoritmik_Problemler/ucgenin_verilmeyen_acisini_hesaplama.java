package Algoritmik_Problemler;

import java.util.Scanner;

public class ucgenin_verilmeyen_acisini_hesaplama {
    public static void main(String[] args) {

        //bir üçgenin iki açısını dışardan girip diğer
        //açısını bulan java kod

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci açı değerini giriniz:");
        int deger1 = scan.nextInt();
        System.out.println("ikinci açı değerini giriniz:");
        int deger2 = scan.nextInt();

        aciBul(deger1,deger2);

    }

    public static void aciBul(int deger1,int deger2){
        int toplam = deger1+deger2;
        int deger3 = 180-toplam;
        System.out.println("üçüncü açı değeri = " + deger3);
    }
}
