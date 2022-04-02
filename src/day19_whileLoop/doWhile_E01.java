package day19_whileLoop;

public class doWhile_E01 {
    public static void main(String[] args) {
        //make write numbers from 9 to 190 that can be diveded into 7.

        for (int i = 9; i <191 ; i++) {
            if (i%7==0) System.out.print(i+" ");
        }
        System.out.println();

        int number=9;
        do {
            if ( number%7==0) System.out.print(number+" ");
            number++;
        }while(number<191);






    }
}
