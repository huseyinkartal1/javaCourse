package day10_Switches;

import java.util.Scanner;

public class C03_Exercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SDET icinden bir kisaltma giriniz ");
        Character ch = scanner.next().charAt(0);

        switch (ch) {
            case 'S', 's':
                System.out.println("Software");
                break;
            case 'D', 'd':
                System.out.println("Developer");
                break;
            case 'E', 'e':
                System.out.println("Engineer");
                break;
            case 'T', 't':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Yeniden deneyiniz");
        }
    }
}