package Algoritmik_Problemler;

import java.util.Scanner;

public class _istenilen_ciktiyi_disardan_girilen_degerlerle_buldurma {
    public static void main(String[] args) {

        //k=x+y2 denkleminin sonucunu dışardan girilen
        //x ve y değerleri için hesaplayan java kodu

        Scanner scan = new Scanner(System.in);

        System.out.println("x değerini  giriniz: ");
        int x = scan.nextInt();

        System.out.println("y değerini giriniz: ");
        int y = scan.nextInt();

        int k = (x+(y*y));
        System.out.println("denklemin sonucu = " + k);
    }
}
