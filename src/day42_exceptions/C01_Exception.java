package day42_exceptions;

import java.util.Scanner;
public class C01_Exception {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("2 ile çarpmak istediğiniz sayıyı giriniz: ");

        try {String sayi=scan.next();
            int value = Integer.parseInt(sayi);
            System.out.println(value*2);
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }


    }

}
