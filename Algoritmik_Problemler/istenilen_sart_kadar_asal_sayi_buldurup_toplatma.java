package Algoritmik_Problemler;

public class istenilen_sart_kadar_asal_sayi_buldurup_toplatma {
    public static void main(String[] args) {

        //20 ye kadar olan asal sayıları bulan ve
        // bunları toplayan java kodu

        int sayi = 2;
        int toplam = 0;

        while(sayi<=20) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam++;
                }
            }

            if (toplam == 0) {
                System.out.println(sayi);
            }
            toplam = 0;
            sayi++;
        }

    }
}
