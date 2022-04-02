package day17_forLoop;

public class Soru11 {
    public static void main(String[] args) {
        //10'dan kucuk sayinin faktorileyini bulun



        int sayi = 10;
        int carpim=1;
        String yazi="";
        for(int i=sayi;i>0;i--){
            carpim*=i;
            yazi+=i+".";
        }

       System.out.println(sayi+"! = "+yazi.substring(0,(yazi.length()-1))+" = "+carpim);
    }
}
