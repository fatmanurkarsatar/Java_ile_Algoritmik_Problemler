package Algoritmik_Problemler;

public class istenilen_araliktaki_mukemmel_sayilari_buldurma {
    public static void main(String[] args) {

        //1-100 arasındaki mükemmel sayıları bulduran java kodu

        for( int i=1;i<=100;i++){
            mukkemmelSayi(i);
        }
    }
    public static void mukkemmelSayi(int s1){
        int toplam =0;
        for(int i=1;i<s1;i++){
            if(s1%i==0){
                toplam+=i;
            }
        }
        if(toplam==s1) {
            System.out.println(s1);
        }
    }

}
