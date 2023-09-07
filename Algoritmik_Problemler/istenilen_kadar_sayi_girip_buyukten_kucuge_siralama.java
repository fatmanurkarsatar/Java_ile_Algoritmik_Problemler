package Algoritmik_Problemler;

import java.util.Scanner;

public class istenilen_kadar_sayi_girip_buyukten_kucuge_siralama {
    public static void main(String[] args) {

        //klavyeden üç sayı alıp ve büyükten küçüğe doğru sıralayan java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi1 = scan.nextInt();

        System.out.println("bir sayı giriniz:");
        int sayi2 = scan.nextInt();

        System.out.println("bir sayı giriniz:");
        int sayi3 = scan.nextInt();

        buyuktenKucuge(sayi1,sayi2,sayi3);


    }
    public static void buyuktenKucuge(int s1, int s2, int s3){
        if(s1>s2){
            if(s1>s3){
                if(s2>s3){
                    System.out.println(s1+" "+s2+" "+s3);
                }else{
                    System.out.println(s1+" "+s3+" "+s2);
                }
            }else{
                System.out.println(s3+" "+s1+" "+s2);
            }
        }else{
            if(s2>s3){
                if(s1>s3){
                    System.out.println(s2+" "+s1+" "+s3);
                }else{
                    System.out.println(s2+" "+s3+" "+s1);
                }
            }else{
                System.out.println(s3+" "+s2+" "+s1);
            }
        }
    }
}
