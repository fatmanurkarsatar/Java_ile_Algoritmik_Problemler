package Algoritmik_Problemler;

import java.util.Scanner;

public class ogrencinin_harf_notunu_hesaplatma {
    public static void main(String[] args) {

        //bir öğrencinin vize notunun %35 ini final notunun
        // %50 sini donem projesinin %15 ini alarak harf
        // notunu hesaplayan java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz: ");
        int vize = scan.nextInt();

        System.out.println("final notunuzu giriniz: ");
        int fınal= scan.nextInt();

        System.out.println("Dönem proje notunuzu giriniz:");
        int donemProje = scan.nextInt();

        float ort = ((vize*35)/100) + ((fınal*50)/100) + ((donemProje*15)/100);
        System.out.println("ortalamanız = " + ort);

        if(90<=ort && ort<100){
            System.out.println("AA");
        }else if(85<=ort && ort<=89){
            System.out.println("BA");
        }else if(80<=ort && ort<=84) {
            System.out.println("BB");
        }else if(70<=ort && ort<=79) {
            System.out.println("CB");
        }else if(60<=ort && ort<=69) {
            System.out.println("CC");
        }else if(50<=ort && ort<=59) {
            System.out.println("DC");
        }else if(45<=ort && ort<=49) {
            System.out.println("DD");
        }else{
            System.out.println("FF");
        }


    }
}
