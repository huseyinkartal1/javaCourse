package day18_nestedForLoop;

public class Soru12 {
    public static void main(String[] args) {

        // make write the shape below according to the given number

        //int input=3;
        //*
        //* *
        //* * *

        int num=5;

        for (int i = 0; i < num ; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
