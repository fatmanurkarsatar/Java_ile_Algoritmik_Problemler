package Algoritmik_Problemler;

public class firma_degeri_hesaplama {
    public static void main(String[] args) {

        //bir firmanın değeri 2014 te 60 bin iken her yıl
        // %21 değer artışı sağlanmakta kaç yıl sonra
        // değeri 900 bin tl üzerinde olur ve hangi yılda oluruz
        // bunu bulan java kodu

        int yil = 2014;
        int sene = 0;
        int deger = 60000;
        int hedefDeger = 900000;

        while(deger<=hedefDeger){
            deger = deger + ((deger*21)/100);
            yil++;
            sene++;
        }
        System.out.println("Yıl  = " + yil);
        System.out.println("Hedefe kaç senede ulaştı = " + sene);
        System.out.println("Güncel değer  = " + deger);


    }
}
