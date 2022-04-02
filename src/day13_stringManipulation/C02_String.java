package day13_stringManipulation;

public class C02_String {
    public static void main(String[] args) {


        java.lang.String str="1-48 of 104 results for \"nutella\"";

        int ilkSpace=str.indexOf(" ");
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);

        System.out.println(str.substring(ilkSpace,ikinciSpace));









    }
}
