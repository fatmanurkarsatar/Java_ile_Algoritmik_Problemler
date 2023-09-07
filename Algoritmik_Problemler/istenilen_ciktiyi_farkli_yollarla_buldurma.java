package Algoritmik_Problemler;

public class istenilen_ciktiyi_farkli_yollarla_buldurma {
    public static void main(String[] args) {

        //1-1-2-3-5-8-13-21 çıktısını üç int değişken üzerinden gerçekleştiren java kodu

        int sayi1 = 1, sayi2=1;
        System.out.print(sayi1 + "-" + sayi2);

        while(sayi2<=21) {
            int sayi3 = sayi2;
            sayi2 = sayi1 + sayi2;
            sayi1 = sayi3;
            System.out.print("-" + sayi2);
        }
    }
}
