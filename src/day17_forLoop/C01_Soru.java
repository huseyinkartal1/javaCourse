package day17_forLoop;

public class C01_Soru {
    public static void main(String[] args) {

// iki harf arasındaki harfleri yazdır

       String a="e";
       String b="p";

        String alfabe="abcdefghijklmnoprstuvyz";

        int baslangic=alfabe.indexOf(a);
        int bitis=alfabe.indexOf(b);



        for(int i=baslangic+1;i<bitis;i++){

            System.out.print(alfabe.charAt(i));
        }


    }
}
