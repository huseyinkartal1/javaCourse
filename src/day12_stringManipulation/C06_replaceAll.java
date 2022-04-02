package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String adSoyad=scanner.nextLine();

        System.out.println(adSoyad.replaceAll("\\S","x"));

        // \\s : bosluk(space)
        // \\S : bosluk dışındaki tüm karakterler
        // \\w : harfler rakamlar
        // \\W : harf rakam dışında kalanlar
        // \\d : rakamlar digits 0-9





    }
}
