package day23_multiDimentionalArrays;

public class Q1 {
    // write a method benefits of the all elements
    // arr1={{1,2,3,},{4,5,6}}

    public static void main(String[] args) {
       int[][] arr1={{1,2,3,},{4,5,6}};
        System.out.println(benefits(arr1));
    }

    public static int benefits(int[][]arr1) {
    int benefits=1;

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length; j++) {
               benefits*= arr1[i][j];
            }
        }
        return benefits;
    }

}
