package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz.");
        int yas=scan.nextInt();

        if(yas<=0||yas>120){
            throw new IllegalArgumentException();
        }else {
            System.out.println("Giriş başaralı.");
        }


    }
}
