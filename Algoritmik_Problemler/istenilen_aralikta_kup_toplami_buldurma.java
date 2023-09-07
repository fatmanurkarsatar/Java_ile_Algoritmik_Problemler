package Algoritmik_Problemler;

public class istenilen_aralikta_kup_toplami_buldurma {
    public static void main(String[] args) {

        //1-15 arasındaki sayıların küplerinin toplamını bulan java kodu

        int toplam = 0;

        for(int i=1;i<=15;i++){
            int kup = i*i*i;
            toplam +=kup;
        }
        System.out.println("toplamları = " + toplam);
    }
}
