package Algoritmik_Problemler;

import java.util.Random;

public class random_bes_sayidan_en_kücügünü_buldurma {
    public static void main(String[] args) {

        //random oluşturulan 5 sayıdan en küçüğünü ekrana yazdıran java kodu

        int kucuk = 0;

        for (int i = 1; i <= 5; i++) {

            Random r = new Random();
            int sayi = r.nextInt();
            System.out.println(sayi);
            if (i == 1) {
                kucuk = sayi;
            }
            if (kucuk > sayi) {
                kucuk = sayi;
            }
        }
            System.out.println("en küçük = " + kucuk);

    }
}



