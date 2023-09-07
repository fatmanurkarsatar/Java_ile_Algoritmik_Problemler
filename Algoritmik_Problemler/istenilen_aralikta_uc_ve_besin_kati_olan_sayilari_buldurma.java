package Algoritmik_Problemler;

public class istenilen_aralikta_uc_ve_besin_kati_olan_sayilari_buldurma {
    public static void main(String[] args) {

        //10'dan 40'a kadar 3 veya 5'in katı olan sayıları toplayan java kodu

        int toplam = 0;
        for(int i=10;i<=40;i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                toplam = toplam + i;
            }
        }
            System.out.println("toplam = " + toplam);



    }
}
