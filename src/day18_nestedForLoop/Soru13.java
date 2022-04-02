package day18_nestedForLoop;

public class Soru13 {
    public static void main(String[] args) {

        // make write the shape below
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*

        double num = 9;

        for (int i = 0; i <= num; i++) {

            if (i <= Math.ceil(num / 2)) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int k = i - 1; k < num; k++) {
                    System.out.print("* ");
                }
                System.out.println();

            }


        }


    }

}
