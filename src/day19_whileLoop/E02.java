package day19_whileLoop;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {

        //write a program that shows "List of full divisors and the number of the divisors"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number : ");
        int number = scanner.nextInt();
        int counter = 0;
        String a="";
        for (int i = 1; i <= number ; i++) {
            if (number%i==0){
                counter++;
                a+=i+", ";
            }

        }
        System.out.println("List of full divisors : "+a.substring(0, a.length()-2));
        System.out.println();
        System.out.println("Total number of whole divisors : " + counter);

    }
}
