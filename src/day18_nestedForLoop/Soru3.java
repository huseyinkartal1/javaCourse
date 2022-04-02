package day18_nestedForLoop;

public class Soru3 {
    public static void main(String[] args) {

        int start = 5;
        int end = 10;
        int sayi = start;

        while (sayi <= end) {
            if (sayi % 2 == 0)
                System.out.print(sayi + " ");
            sayi++;
        }


    }
}
