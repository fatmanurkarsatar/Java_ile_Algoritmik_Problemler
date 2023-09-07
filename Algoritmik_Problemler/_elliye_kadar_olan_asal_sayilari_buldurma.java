package Algoritmik_Problemler;

public class _elliye_kadar_olan_asal_sayilari_buldurma {
    public static void main(String[] args) {

        //0-50 ye kadar olan asal sayıları bulduran java kodu

        int sayi = 2;
        int toplam=0;
        int asalSayiToplam=0;

        while(sayi<=50) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam++;
                }
            }

            if (toplam == 0) {
                asalSayiToplam = asalSayiToplam+sayi;
            }
            toplam = 0;
            sayi++;
        }
        System.out.println("asal sayılar toplamı = " + asalSayiToplam);

    }
}
