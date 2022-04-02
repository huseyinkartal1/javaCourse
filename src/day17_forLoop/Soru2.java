package day17_forLoop;

public class Soru2 {
    public static void main(String[] args) {
        // Make write numbers between 10-30(numbers included), make sure there is a comma between numbers.

        int num1 = 10;
        int num2 = 30;
        String sonuc = "";
        for (int i = num1; i <= num2; i++) {

            sonuc += (i + ", ");
        }

        System.out.println(sonuc.substring(0, sonuc.length() - 2));

    }

}
