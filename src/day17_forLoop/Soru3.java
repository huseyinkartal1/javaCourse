package day17_forLoop;

public class Soru3 {
    public static void main(String[] args) {

        // Make write numbers from 100 to 50 (included) on the console in one line
        // (make sure put a comma between numbers)


        int a = 100;
        int destination=50;
        String result="";

        for (int i = a; i >= destination; i--){

            result+=(i+", ");

        }

        System.out.print(result.substring(0,result.length()-2));

    }
}
