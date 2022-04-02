package day22_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr = {10,3,5,9,10,55,3,2,77,5,7,66,1,4,7};

        //sort this array without Arrays.sort() method;

        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] < min)
                min=arr[i];
            if (arr[i] > max)
                max=arr[i];
        }
        System.out.println(min);
        System.out.println(max);

        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);



    }
}
