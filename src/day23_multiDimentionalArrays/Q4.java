package day23_multiDimentionalArrays;

import java.util.Arrays;

public class Q4 {
    // make a new array like
    // {1,2,3},{4,5},{6,7} --> {6,9,13}

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5},{6,7}};

        newArr(arr);

    }

    public static void newArr(int[][] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int each2:arr[i]) {
                newArr[i]+=each2;
            }
        }


        System.out.println(Arrays.toString(newArr));


    }

}
