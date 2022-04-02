package day17_forLoop;

public class Soru8 {

    //write a method that reverses a String


    public static void main(String[] args) {

        String word = "Word";

        writeReverse(word);


    }

    private static void writeReverse(String x) {
        String reveredWord = "";
        for (int i = x.length() - 1; i >= 0; i--) {

            reveredWord += x.charAt(i);
        }
        System.out.println("The word is = " + x +
                "\nThe word written in reversed is = " + reveredWord);
    }
}
