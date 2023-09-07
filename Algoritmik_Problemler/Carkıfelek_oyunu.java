package Algoritmik_Problemler;

import java.util.Random;

public class Carkıfelek_oyunu {
    public static void main(String[] args) {

        //kullanıcı 5 kere çark çevirsin, her çevirmede 1-10 arasında
        //rastgele sayı oluştursun. 1-3-5 dışındaki tüm
        // sayılar 10 ile çarpılıp puana eklensin 1-3-5
        // geldiğinde iflas etsin sonunda kaç puanı var ekrana bassın
        //bu soruyu bulan java kodu

        int puan = 0;
        for(int i=1;i<=5;i++){
            Random rn = new Random();
            int sayi = rn.nextInt(10)+1;
            System.out.println("çarktan gelen sayı = " + sayi);
            if(sayi==1 || sayi==3 || sayi==5){
                puan = 0;
            }else{
                int yenipuan = sayi*10;
                puan = puan + yenipuan;
            }
        }
        System.out.println("puanınız = " + puan);

    }
}
