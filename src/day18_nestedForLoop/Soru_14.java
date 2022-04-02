package day18_nestedForLoop;

public class Soru_14 {
    public static void main(String[] args) {

        /*
        make write the pattern below
        A
        A B
        A B C
        */

        char input = 'Z';

        for (char i = 'A'; i <= input; i++) {

            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = (int)input - 1; i >= (int)('A'); i--) {

            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
