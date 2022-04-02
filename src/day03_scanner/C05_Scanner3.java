package day03_scanner;

import java.util.Scanner;

public class C05_Scanner3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir yarıçap giriniz...");


        double yaricap=scan.nextDouble();

        System.out.println("Dairenin çevresi: " + (2 * Math.PI * yaricap) );
        System.out.println("Dairenin alanı: " + (Math.PI*yaricap*yaricap));


    }
}
