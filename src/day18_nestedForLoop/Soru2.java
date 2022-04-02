package day18_nestedForLoop;

public class Soru2 {
    public static void main(String[] args) {

        for (int i = 0; i <1000 ; i++) {
            if(i%15==0 && i%20==0 && i%90==0)
                System.out.println(i);

        }


    }
}
