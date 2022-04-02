package day05_matematikselIslemler;

public class C05_WrapperClass {


        int x = 5;

    public static void main(String[] args) {


        String str1="12345";
        String str2="23456";

        // verilen iki stringdeki sayıları toplayın

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));


        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][1]);




        C05_WrapperClass myObj = new C05_WrapperClass();
        System.out.println(myObj.x);


    }
}
