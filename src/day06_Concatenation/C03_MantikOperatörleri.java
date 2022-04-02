package day06_Concatenation;

public class C03_MantikOperatörleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);  //false

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8;  //true

        System.out.println(sonuc1);




        int sayi3=15; // 10 ile 20 arasında olduğunu true olarak çevirelim.

        boolean aralik= sayi3<20 && sayi3>10;

        System.out.println(sayi3 + " sayısı 10-20 aralığında mı: " + aralik);

        int sayi4=5; // 10-20 in arasında olmadığını true döndürelim
        boolean araliktaDegil = sayi4<10 || sayi4>20;
        System.out.println(sayi4 + " sayısı 10-20 aralık dışında mı: " +araliktaDegil);






    }
}
