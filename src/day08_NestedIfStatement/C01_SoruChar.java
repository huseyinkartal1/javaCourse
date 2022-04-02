package day08_NestedIfStatement;

import java.awt.*;
import java.util.Scanner;

public class C01_SoruChar {
    public static void main(String[] args) {
        //girilen bir karakterin harf olup olmadığını bulalım


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz");

       char karakter=scan.next().charAt(0);


       if((karakter>='A' && karakter <='Z') || (karakter >='a' && karakter <='z')){
            System.out.println("Girdiginiz karakter harftir");
        }else{
            System.out.println("Girdiginiz karakter harf değildir");

        }


    }
}
