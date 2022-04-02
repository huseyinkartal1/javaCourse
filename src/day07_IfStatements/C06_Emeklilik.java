package day07_IfStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
        int yas=scan.nextInt();


        if(yas>=65){
            System.out.println("Emekli olabilirsiniz.");
        }else{
            System.out.println("Emekli olamazsınız.");
            System.out.println(65-yas+ " sene daha calismalisin.");
        }









    }
}
