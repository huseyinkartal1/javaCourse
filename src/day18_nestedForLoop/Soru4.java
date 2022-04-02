package day18_nestedForLoop;

public class Soru4 {
    public static void main(String[] args) {

        char start='f';
        char end='w';
        char ch=start;

        while(ch<=end){
            System.out.print(String.valueOf(ch).toUpperCase().replaceAll("\\W","")+" ");
            ch++;
        }


    }
}
