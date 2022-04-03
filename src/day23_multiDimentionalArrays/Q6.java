package day23_multiDimentionalArrays;

import java.util.Arrays;

public class Q6 {
    //remove the input number from an Array and make a newArr
    public static void main(String[] args) {

        int[] arr={1,2,4,5,6,1,2,4,1,8};

        int input = 1;

        newArr(arr, input);



    }

    public static void newArr(int[] arr, int input) {
        int[] newArr = new int[arr.length];
        int num = 0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=input){
                newArr[num]=arr[i];
                num++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
