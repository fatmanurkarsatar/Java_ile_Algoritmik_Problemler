package Algoritmik_Problemler;

import java.util.Random;
import java.util.Scanner;

public class Rastgele_sayi_bulan_oyun {
    public static void main(String[] args) {

        //rastgele oluşturulan bir sayıyı (1-100 arası) bulan oyun tasarlayın.
        //girilen sayyı rastgele oluşturulan sayıdan büyük yada
        //küçükse bilgilendirsin. Kullanıcının 3 hakkı
        // olsun hakkı bitince oyundan çıksın

        int sayac=5;
        Random rn = new Random();
        int RandomSayi = rn.nextInt(100)+1;
        System.out.println("random sayı = " + RandomSayi);
        while(sayac>0){
            System.out.println("tahminde bulun. " + sayac + " hakkın var");
            Scanner scan = new Scanner(System.in);
            System.out.println("bir sayı giriniz:");
            int tahmin = scan.nextInt();

            if(tahmin==RandomSayi) {
                System.out.println("tebrikler buldunuz");
                break;
            }else if (RandomSayi>tahmin) {
                System.out.println("Daha büyük sayı giriniz:");
                sayac--;
            }else{
                System.out.println("daha küçük sayı giriniz:");
                sayac--;

        }
        }
    }
}
