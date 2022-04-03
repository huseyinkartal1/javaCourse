package day33_varargs_stringBuilder;

public class C01_varargs {
    public static void main(String[] args) {

        int a=5;
        String b="Ali";
        String c="Veli";


        System.out.println(method(a,b,c));
    }

    public static int method(int arg1, String... arg2){
        int carpim=1;
        for (String each:arg2
             ) {
            carpim*=each.length();
        }
     return carpim*arg1;
    }
}
