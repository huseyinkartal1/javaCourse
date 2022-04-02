package day11_stringManipulation;

import java.util.Scanner;

public class C06_E2_equalIgnoreCase_ile_OLURMU {
    public static void main(String[] args) {
        String cumle="";
        String kelime="";
        boolean sorgu;

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir cumle giriniz:");
        cumle=scan.nextLine();
        System.out.print("Lütfen aramak istediğiniz kelimeyi giriniz:");
        kelime=scan.nextLine();
        sorgu=cumle.contains(kelime);

        int kelimeSayisi=cumle.split(kelime, -1).length - 1;

        if(sorgu==true){
            if (kelimeSayisi==1){
                System.out.println("Girilen kelime cümlede bir kere kullanılmış");
            }else{
                System.out.println("Girilen kelime cümlede birden fazla kullanılmış");
                System.out.println("Kullanım sayısı:"+kelimeSayisi);
            }
        }
        else{
            System.out.println("girdiğiniz kelime cümlede kullanılmamış");
        }

    }
}
