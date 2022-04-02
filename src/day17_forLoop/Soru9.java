package day17_forLoop;

public class Soru9 {
    public static void main(String[] args) {


        // kelimenin polindrome olup olmadığını kontrol ediniz
        // polindrome= tersten okunuşu aynı olan kelimedir.

        String str="Kalaalak";
        String strReversed="";


       for (int i=str.length()-1;i>=0;i--){
           strReversed+=(str.charAt(i));
       }

        System.out.println("Kelimenin tersten yazılışı = "+strReversed);


       if(str.equalsIgnoreCase(strReversed)){
           System.out.println("Kelime polindrome'dur.");
       }else{
           System.out.println("Polindrome değildir.");
       }



    }
}
