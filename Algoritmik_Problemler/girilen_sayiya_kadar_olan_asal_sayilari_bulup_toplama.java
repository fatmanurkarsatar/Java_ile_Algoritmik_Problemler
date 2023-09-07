package Algoritmik_Problemler;

import java.util.Scanner;

public class girilen_sayiya_kadar_olan_asal_sayilari_bulup_toplama {
    public static void main(String[] args) {

        //klavyeden girilen sayıya kadar olan asal
        //sayıların toplamını yazdıran java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();

        int toplam=0;
        int s;

        for(int i=2;i<=sayi;i++){
            if(sayi%i==0){
                toplam+=i;
            }
        }
        System.out.println(toplam);
    }
}
