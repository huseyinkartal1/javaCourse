package day09_ternary_Switch;

import java.util.Scanner;

public class C04_TernaryNested {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi<100?sayi<10?"rakam":"iki basamakli sayi":"uc basamaklı veya daha buyuk sayi");







    }
}
