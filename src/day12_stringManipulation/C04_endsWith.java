package day12_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        String email="huseyinkartal@gmail.com";
        String arananMetin="@gmail.com";

        if(!email.contains(arananMetin)){
            System.out.println("luftfen gecerli mail giriniz");
        }else if(email.endsWith(arananMetin)){
            System.out.println("Email kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontrol ediniz");
        }







    }
}
