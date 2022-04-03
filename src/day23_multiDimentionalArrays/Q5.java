package day23_multiDimentionalArrays;
import java.util.Scanner;
public class Q5 {

    //get a sentence from a user
    //count how many words are there

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String str = scanner.nextLine();

        countWords(str);

    }

    public static void countWords(String str) {
        str = str.trim();
        String[] strArr=str.split( " ");
        System.out.println("The number of the words in your sentence : " + strArr.length);


    }
}
