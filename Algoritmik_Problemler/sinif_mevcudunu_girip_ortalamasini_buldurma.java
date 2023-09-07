package Algoritmik_Problemler;

import java.util.Scanner;

public class sinif_mevcudunu_girip_ortalamasini_buldurma {

    public static void main(String[] args) {

        //bir sınıf x kişiden oluşmaktadır. x sayısını
        //klavyeden girip x kadar kişisinin sınav notunu girip
        //girip sınıfın ortalamasını bulan java kod

        Scanner scan = new Scanner(System.in);
        System.out.println("Sınıf mevcudunu giriniz:");
        int mevcut = scan.nextInt();

        int toplam = 0;
        for(int i=1;i<=mevcut;i++){
            System.out.println("öğrencinin notunu giriniz:");
            int not = scan.nextInt();
            toplam+=not;

        }
        System.out.println("notların toplamı = " + toplam);
        double ort = (toplam/mevcut);
        System.out.println("sınıf ortalaması = " + ort);
        if(ort>60){
            System.out.println("sınıf başarılıdır");
        }else if(ort==60){
            System.out.println("çokta başarılı değil daha çok çaışın");
        }else{
            System.out.println("çalışın köpekler");
        }

    }
}
