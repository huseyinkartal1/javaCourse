package day18_nestedForLoop;
import java.util.Scanner;
public class C07_whileLoop {
    public static void main(String[] args) {

        // değişken adet sayının toplamını yazdır
        // 0 yazıldığında dursun

        Scanner scanner = new Scanner(System.in);

        int toplam=0;
        int sayi=1;

                while(sayi!=0){
                    System.out.println("Sayi giriniz");
                     sayi=scanner.nextInt();
                    toplam+=sayi;
                }

        System.out.println(toplam);




    }
}
