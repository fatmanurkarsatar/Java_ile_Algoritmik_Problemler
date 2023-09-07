package Algoritmik_Problemler;

import java.util.Random;

public class rastgele_sayi_olusturma {
    public static void main(String[] args) {

        //rastgele sayı oluşturup yazdıran java kod

        Random r = new Random();
        int sayi = r.nextInt();
        System.out.println(sayi);
    }
}
