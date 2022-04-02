package day23_multiDimentionalArrays;

public class C01_sumArraysElements {
    public static void main(String[] args) {

        int[][] arr = {{3,1,4},{6,10,2}};

        int sum=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }

        }

        System.out.println(sum);

    }
}
