package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Derse katılmak istiyor musunuz\n" +
                "Evet veya Hayır yaziniz");

        String cevap=scanner.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("Cevabiniz "+cevap+ " derse katilim onaylanmıştır.");
        }else if(cevap.equalsIgnoreCase("hayir")){
            System.out.println("Cevabiniz "+cevap+ " sonra bekleriz");

        }


    }
}
