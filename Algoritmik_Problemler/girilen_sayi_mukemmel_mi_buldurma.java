package Algoritmik_Problemler;

public class girilen_sayi_mukemmel_mi_buldurma {
    public static void main(String[] args) {

        //kendisi dışında bölenlerinin toplamı kendisine eşit
        //olan sayılara mükemmel sayı denir. 28 sayısı mükemmel
        //sayıdır. 28 sayısının mükemmel sayı olduğunu hesaplayan java kodu

        mukkemmelSayi(27);
    }

    public static void mukkemmelSayi(int s1){
        int toplam =0;
        for(int i=1;i<s1;i++){
            if(s1%i==0){
                toplam+=i;
            }
        }
        if(toplam==s1){
            System.out.println("mükemmel sayıdır");
        }else{
            System.out.println("mükkemel sayı değildir");
        }
    }
}
