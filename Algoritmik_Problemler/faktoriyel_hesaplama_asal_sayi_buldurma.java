package Algoritmik_Problemler;

import java.util.Random;

public class faktoriyel_hesaplama_asal_sayi_buldurma {
    public static void main(String[] args) {

        //oluşturulan rastgele sayının faktöriyelini hesaplayın,
        //asal sayı olup olmadığını kontrol eden java kodu

        Random rn = new Random();
        int sayi = rn.nextInt(100) + 1;
        System.out.println(sayi);

        faktoriyelHesapla(sayi);
        asalSayiKontrol(sayi);

    }
    public static void faktoriyelHesapla(int s1) {
        double carpim = 1;
        for (int i = 1; i <= s1; i++) {
            carpim = carpim * i;
        }
        System.out.println("sayının faktöriyeli = " + carpim);

    }
    public static void asalSayiKontrol(int s1){

        int toplam=0;
        for(int i=2;i<s1;i++){
            if(s1%i==0){
                toplam++;
            }
        }
        if(toplam==0){
            System.out.println("sayi asaldır");
        }else{
            System.out.println("sayı asal değildir");
        }
    }
}
