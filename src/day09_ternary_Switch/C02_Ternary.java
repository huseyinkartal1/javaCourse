package day09_ternary_Switch;

public class C02_Ternary {
    public static void main(String[] args) {

        // if(condition) {code1} else {code2}
        // ternary
        // condition ? code1 : code2;


        int sayi=100;

        var i = sayi > 50 ? sayi + 10 : sayi * 2;

        System.out.println(i);
    }
}
