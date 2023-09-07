package Algoritmik_Problemler;

public class _10_a_kadar_olan_sayilari_buldurup_toplatma {
    public static void main(String[] args) {

        //10 a kadar olan sayıların toplamını hesaplayan java kodu

        int toplam = 0;

        for(int i=0;i<=10;i++){
            toplam +=i;
        }
        System.out.println("toplam = " + toplam);



    //while ile yap

    int sayi=0;
    int toplam1 = 0;

    while(sayi<=10){
        toplam1 +=sayi;
        sayi++;
    }
        System.out.println(toplam1);


    }
}
