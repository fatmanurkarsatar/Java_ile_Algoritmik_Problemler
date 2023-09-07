package Algoritmik_Problemler;

import java.util.Scanner;

public class klavyeden_girilen_sayiya_kadar_olan_asal_sayilari_buldurma {
    public static void main(String[] args) {

        //klavyeden girilen sayıya kadar olan asal
        //sayıları yazdıran java kod

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();

        for(int i=2;i<=sayi;i++){
            asalSayi(i);
        }
        asalSayi(sayi);

    }
    public static void asalSayi(int s1){
        int toplam = 0;
        for(int i=2;i<s1;i++){
            if(s1%i==0){
                toplam++;
            }
        }
        if(toplam==0){
            System.out.println(s1);
        }
    }
}
