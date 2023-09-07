package Algoritmik_Problemler;

import java.util.Scanner;

public class mukemmel_sayi_buldurma {
    public static void main(String[] args) {

        //dışardan girilen sayıya kadar olan mükemmel
        // sayıları yazdıran java kod

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();

        for (int i = 1; i < sayi; i++) {
            mukkemmelSayi(i);
        }
    }

    public static void mukkemmelSayi(int s1) {
        int toplam = 0;
        for (int i = 1; i < s1; i++) {
            if (s1 % i == 0) {
                toplam += i;
            }
        }
        if (toplam == s1) {
            System.out.println(s1);
        }
    }
}
