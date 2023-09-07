package Algoritmik_Problemler;

import java.util.Scanner;

public class isci_ucreti_hesaplama {
    public static void main(String[] args) {

        //bir fabrikada işçinin alacağı ücret hesaplanırken şu kriterlere uyulur;
        //eğer işçi 40 saatten az çalışmışsa çalıştığı saat ve saat ücreti çarpılarak alacağı ücret hesaplanıyor
        //eğer işçi 40 saat ve daha fazla çalışmışsa saat ücretine %21 zam yapılıp haftalık maaşı hesaplanacak
        //buna göre dışardan çalışma saati ve saat ücreti girilen bir işçinin alacapı haftalık maaşı
        // hesaplayan java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("çalışma saatini giriniz:");
        int cs = scan.nextInt();

        System.out.println("Çalışma saat ücretini giriniz:");
        int csu = scan.nextInt();

        int haftalikMaas = 0;
        if(cs>=40) {
            cs = ((cs * 21) / 100) + csu;
            haftalikMaas = cs * csu;
        }else{
            haftalikMaas = cs * csu;
        }
        System.out.println("haftalık maaş = " + haftalikMaas);


    }
}
