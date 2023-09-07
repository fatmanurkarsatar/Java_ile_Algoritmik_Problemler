package Algoritmik_Problemler;

import java.util.Scanner;

public class kullaniciya_istedigi_islemi_yaptiran_uygulama {
    public static void main(String[] args) {

        //program çalışınca kullanıcıya çarpma bölme toplama
        //çıkarma seçenekleri sunulsun, kullanıcı hangi seçeneği
        //seçerse girdiği iki sayı üzerinden işlem yapan java kod

        Scanner scan = new Scanner(System.in);

        System.out.println("bir sayı giriniz:");
        int s1 = scan.nextInt();
        System.out.println("bir sayı daha giriniz:");
        int s2 = scan.nextInt();
        System.out.println("hangi işlemi yapmak istiyorsunuz:");
        double islem = scan.nextDouble();

        int topla = 1;
        int cikar = 2;
        int carpma = 3;
        double bolme = 4;


        if (islem == 1) {
            System.out.println("toplama = " + (s1 + s2));
        } else if (islem == 2) {
            System.out.println("çıkarma = " + (s1 - s2));
        } else if (islem == 3) {
            System.out.println("çarpma = " + (s1 * s2));
        } else {
            System.out.println("Bölme  = " + (s1 / s2));

        }
    }
}
