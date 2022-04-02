package day12_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

 //girilen cümledeki gecen kelime sayısını bulmayı lastIndexOf ile çözelim.


        String cumle="Merhaba, bugün hava güzel ve Java çok güzel";
        String kelime="güzel";


        int ilkkullanim=cumle.lastIndexOf(kelime);
        int ikincikullanim=cumle.lastIndexOf(kelime,ilkkullanim-1);

        if(ilkkullanim==(-1)){
            System.out.println("Cümlede kelime kullanılmamıştır");
        }else if(ikincikullanim==(-1)){
            System.out.println("Cümlede bu kelime bir kez kullanılmıştır.");
        }else {
            System.out.println("Kelime cümlede birden fazla kullanılmıştır.");
        }














    }
}
