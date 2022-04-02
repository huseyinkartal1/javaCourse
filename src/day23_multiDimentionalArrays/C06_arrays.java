package day23_multiDimentionalArrays;

import java.util.Arrays;

public class C06_arrays {
    public static void main(String[] args) {

        int arr1[][]={{1,2},{3,4,5},{6}};
        int arr2[][]={{7,8,9},{10,11},{12}};

        sumSameIndex(arr1,arr2);

    }

    public static void sumSameIndex(int[][] arr1, int[][] arr2) {

        String result="";


            for (int i = 0; i < arr1[i].length; i++) {
                for (int j = 0; j < arr2[j].length ; j++) {
                    result+="["+i+"]"+"["+j+"] "+(arr1[i][j]+arr2[i][j])+"\n";
                }
            }


        System.out.println(result);
    }
}
