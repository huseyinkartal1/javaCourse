package day11_stringManipulation;

import java.util.Scanner;

public class C06_E2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String str1=scanner.nextLine();
        System.out.println("Bir kelime giriniz");
        String str2=scanner.next();

        int ilkstr2index=str1.toLowerCase().indexOf(str2.toLowerCase());


       if (str1.toLowerCase().indexOf(str2.toLowerCase())==(-1)){
            System.out.println("Aradığınız kelime cümlede yoktur");

        }else if(str1.toLowerCase().indexOf(str2.toLowerCase(),ilkstr2index+1)==(-1)){
            System.out.println("Aradığınız kelime cümlede bir kez geçmektedir");

        }else{
           System.out.println("Aradağınız kelime cümlede birden fazla kullanılmıştır");
       }





    }
}
