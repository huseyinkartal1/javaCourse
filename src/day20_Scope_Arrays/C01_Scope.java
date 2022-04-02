package day20_Scope_Arrays;

public class C01_Scope {

    int number;
    static String schoolName="Yildiz college";
    static int num2;
    static boolean isOpen;

    
    public static void main(String[] args) {

        C01_Scope obj1=new C01_Scope();
        System.out.println(obj1.number); // 0
        System.out.println(schoolName);
        System.out.println(num2); // 0
        num2=102;
        System.out.println(num2); // 102
        System.out.println(isOpen); // false

        staticMethod();
        System.out.println(num2);
    }

    public static void staticMethod(){

        num2=200;
        System.out.println(num2); //200


    }


}
