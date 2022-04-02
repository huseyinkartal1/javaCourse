package day26_forEachLoop_constructor;

public class C01_forEachLoop {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i:arr) {
            System.out.print(i+" ");
        }

    }
}
