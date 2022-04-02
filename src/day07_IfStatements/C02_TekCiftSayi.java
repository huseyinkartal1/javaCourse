package day07_IfStatements;

import javax.script.ScriptContext;
import java.util.Scanner;

public class C02_TekCiftSayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi=scan.nextInt();


        if(sayi%2==0){
            System.out.println("Girdiginiz sayi çifttir.");
        }else{
            System.out.println("Girdiginiz sayi tektir.");
        }








    }
}
