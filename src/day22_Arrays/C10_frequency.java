package day22_Arrays;

public class C10_frequency {
    public static void main(String[] args) {
        //Karakterlerin sıklığını bulabilen bir metod yazar misiniz ?
        //
        //Ör: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String str="AAABBCDD";

        System.out.println( FrequencyOfChars(str));
    }

    private static String FrequencyOfChars(String str) {
        String result="";
        String fCh="";
        int counter=0;

        for (int i = 0; i < str.length()-1 ; i++) {

            if (str.substring(i,i+1)==str.substring(i+1,i+2)){
                counter++;
                //fCh+=str.substring(i,i+1);
            }
          //   result+=fCh+counter;
        }

        return result+counter;

    }


}
