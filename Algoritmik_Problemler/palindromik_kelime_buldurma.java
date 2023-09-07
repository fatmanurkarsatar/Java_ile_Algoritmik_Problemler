package Algoritmik_Problemler;

import java.util.Scanner;

public class palindromik_kelime_buldurma {
    public static void main(String[] args) {
        //terstende aynı okunan kelimelere palindromik kelimeler
        //denir konsoldan girilen bir 5 harfli kelimenin palindromik
        //olup olmadığını kontrol eden java kodu

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz:");
        String word = scan.nextLine();

        int sayac=0;
        String newWord = "";

        for(int i=(word.length()-1);i>=0;i--){
            newWord+= word.charAt(i);
        }
        if(newWord.equals(word)){
            System.out.println("girilen kelime palindrom bir kelimedir");
        }else{
            System.out.println("girilen kelime palindrom bir kelime değildir.");
        }
    }
}
