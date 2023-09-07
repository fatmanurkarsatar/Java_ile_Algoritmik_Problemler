package Algoritmik_Problemler;

import java.util.Scanner;

public class girilen_sayi_mukemmel_sayi_mi_buldurma {
    public static void main(String[] args) {

        //dışardan girilen bir sayının mükemmel
        // sayı olup olmadığını kontrol eden java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();

        MukkemelSayiMi(sayi);
    }
    public static void MukkemelSayiMi(int s1){
        int toplam=0;
        for(int i=1;i<s1;i++){
            if(s1%i==0){
                toplam+=i;
            }
        }
        if(toplam==s1){
            System.out.println("mükemmel sayıdır");
        }else{
            System.out.println("mükemmel sayı değildir");
        }
    }
}
