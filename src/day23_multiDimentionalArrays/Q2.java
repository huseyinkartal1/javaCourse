package day23_multiDimentionalArrays;

public class Q2 {

    //benefist of the last element of each element.
    // arr= { {1,2,3},{4,5},{6} }
    // 3 * 5 * 6

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5},{6} };


        System.out.println(benefitsLastElement(arr));
    }

    public static int benefitsLastElement(int[][] arr) {
    int benefits=1;
        for (int i = 0; i < arr.length ; i++) {
           benefits*=arr[i][arr[i].length-1];
        }
        return benefits;
    }

}
