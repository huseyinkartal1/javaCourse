package day07_IfStatements;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String gun=scan.next().toLowerCase();

        if (gun.equals("pazar") || gun.equals("cumartesi")){
            System.out.println("Hafta Sonu!");
        }else if(gun.equals("pazartesi")||gun.equals("sali")||
        gun.equals("carsamba")||gun.equals("persembe")||gun.equals("cuma"))
            {System.out.println("Hafta Içi");
        }else{
            System.out.println("Yanlış giriş yaptınız.");
        }

    //String ifadelerde == kullanilması tavsiye edilmez.
    //Beklediğimizden farkli sonuc verebilir.






    }
}
