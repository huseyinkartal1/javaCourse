package day23_multiDimentionalArrays;

public class Q3 {
    // arr1= {1,2},{3,4,5},{6}
    // arr2= {7,8,9},{10,11},{12}
    // sum all of the same index elemets
    public static void main(String[] args) {
        int [][]arr1= {{1,2},{3,4,5},{6}};
        int [][]arr2= {{7,8,9},{10,11},{12}};



        System.out.println(sumSameIndex(arr1, arr2));
    }

    public static int sumSameIndex(int[][] arr1, int[][] arr2) {
        int sum=0;
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                for (int k = 0; k <arr2.length ; k++) {
                    for (int l = 0; l < arr2[k].length; l++) {
                        if(i==k&&j==l) sum+=arr1[i][j]+arr2[k][l];
                    }
                }
            }
        }
        return sum;
    }


}
