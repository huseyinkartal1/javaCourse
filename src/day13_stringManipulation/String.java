package day13_stringManipulation;

public class String{

    public static void main(String[] args) {

        java.lang.String str="Java ile IT cok guzel";


        System.out.println(str.substring(1).replaceAll("\\w","*"));


        System.out.println(str.charAt(5));
        System.out.println(str.substring(5, 6));




    }
}
