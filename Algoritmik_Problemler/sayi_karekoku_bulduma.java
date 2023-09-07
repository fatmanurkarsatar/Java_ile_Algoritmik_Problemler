package Algoritmik_Problemler;

import java.util.Scanner;

public class sayi_karekoku_bulduma {
    public static void main(String[] args) {

        //girilen sayının hangi sayının karekökü olduğunu
        //bulan java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();

        int i = 1;
        while((i*i!=sayi) && i<=(sayi/2)){
            i++;
        }
        if((i*i)==sayi){
            System.out.println(sayi+" "+ i + " nin karesidir");
        }
        System.out.println("i="+i);
        }
    }

