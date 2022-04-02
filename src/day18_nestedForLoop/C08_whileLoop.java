package day18_nestedForLoop;

import java.util.Scanner;

public class C08_whileLoop {
    public static void main(String[] args) {

        //kullanıcının girdiği sayılar toplansın, 500'ü geçtiğinde loop dursun

        Scanner scanner = new Scanner(System.in);

        int input=0;
        int toplam=0;

        while(toplam<500){
            System.out.println("Sayi giriniz");
            input=scanner.nextInt();
            toplam+=input;

        }

        System.out.println("500'ü geçtiniz.");
        System.out.println("Toplam sayi = "+toplam);



    }
}
