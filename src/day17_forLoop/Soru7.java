package day17_forLoop;

public class Soru7 {
    public static void main(String[] args) {

        // reverse a String

        String word = "Word";
        String reversedWord = "";


        for (int i = word.length() - 1; i >= 0; i--) {

            reversedWord += word.charAt(i);


        }

        System.out.println("The reversed word is = " + reversedWord);


    }
}
