package Algoritmik_Problemler;

import java.util.Scanner;

public class string_ifadeleri_yan_yana_yazdirma {
    public static void main(String[] args) {

        //klavyeden girilen 5 string ifadeyi yan
        // yana konsola yazdıran kod

        Scanner scan = new Scanner(System.in);

        String ciktilar="";

        for(int i=0;i<5;i++){
            System.out.println("String bir ifade giriniz:");
            String ifade = scan.nextLine();
            ciktilar+=ifade;
        }
        System.out.println(ciktilar);




    }
}
