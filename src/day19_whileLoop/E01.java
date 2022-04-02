package day19_whileLoop;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {

        // Write a java program that creates a multibly table for a given number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number please.");
        int input=scanner.nextInt();

        for (int i = 1; i<11 ; i++) {

                System.out.println(input+" x "+i+" = "+i*input);

            }
        }
    }