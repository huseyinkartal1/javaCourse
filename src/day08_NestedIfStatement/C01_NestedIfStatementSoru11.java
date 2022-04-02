package day08_NestedIfStatement;

import java.util.Scanner;

public class C01_NestedIfStatementSoru11 {
    public static void main(String[] args) {


        // SORU 11
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a password: ");
        String pass = scan.next();

        char ch = pass.charAt(0);


        if (Character.isUpperCase(ch)) {

            if (ch == 'A') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }

        } else {

            if (ch == 'z') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }


        }
    }
}