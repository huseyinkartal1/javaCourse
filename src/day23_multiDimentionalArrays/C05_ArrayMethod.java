package day23_multiDimentionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_ArrayMethod {
    public static void main(String[] args) {

        int arr[]={1,3,6};

        arr=addElement(arr,8);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] addElement(int[] arr, int element) {
        int[] newarr = new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            newarr[i]=arr[i];
        }
        newarr[3]=element;
        arr=newarr;
        return arr;
    }

}
