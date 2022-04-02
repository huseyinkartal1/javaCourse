package day23_multiDimentionalArrays;
import java.util.Arrays;
import java.util.Scanner;
public class C04_question {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write element size in your array:");
        int[] arr=new int[scanner.nextInt()];

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Write element "+"("+(i+1)+") : ");
            arr[i] = scanner.nextInt();
            }
        System.out.println("Your array : " +Arrays.toString(arr));



    }
}
