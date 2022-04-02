package day19_whileLoop;
import java.util.Scanner;
public class doWhile_E03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        int sum=0;
        int counter=0;
        int negCounter=0;

        do {
                System.out.println("Write a number  (To stop the program wrote \"0\") : ");
                input=scanner.nextInt();
            if (input<0){
                System.out.println("Dont input negative number ");
                negCounter++;
            }else if(input>0){
                sum+=input;
                counter++;
            }


        }while (input!=0);


        System.out.println("Sum of numbers : "+sum);
        System.out.println("Number of positive inputs : " +counter);
        System.out.println("Number of negative inputs : " +negCounter);




    }
}
