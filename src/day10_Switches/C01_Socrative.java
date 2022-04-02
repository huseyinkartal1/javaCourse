package day10_Switches;

import java.util.Scanner;

public class C01_Socrative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Haftanın kaçıncı günü olduğunu yazınız.\"1.gün Pazartesiden başlıyor\"");
        int gun = scanner.nextInt();

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;


        }


    }
}
