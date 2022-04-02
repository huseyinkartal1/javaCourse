package day22_Arrays;

import java.util.Arrays;

public class C03_MaxToMin {
    public static void main(String[] args) {



        int[] arr={1,5,9,8,44,55,88,3,2,5};

        Arrays.sort(arr);

        int arr2[]=revesedArr(arr);

        System.out.println(Arrays.toString(arr2));


    }

    private static int[] revesedArr(int arr[]) {
        int[] arr2=new int[arr.length];

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[arr.length-1-i];
        }

        return arr2;
    }
}
