import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsString {
    public static void main(String[] args) {
        //String str = "Marge, let's \"went.\" I await news telegram.";
        String str = ".a";
        System.out.println(reverseVowels(str));
    }

    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        int vLeftPos = -1;
        String firstHalfStr = "";
        String secondHalfStr = "";
        String vowel = "aeiouAEIOU";
        while (i <= j) {
            if (!vowel.contains("" + s.charAt(i))) {
                firstHalfStr = firstHalfStr + s.charAt(i);
                i++;
            } else {
                vLeftPos = i;
                if (!vowel.contains("" + s.charAt(j))) {
                    secondHalfStr = s.charAt(j) + secondHalfStr;
                    j--;
                } else {
                    if (vLeftPos != -1 && i!=j) {
                        firstHalfStr = firstHalfStr + s.charAt(j);
                        secondHalfStr = s.charAt(vLeftPos) + secondHalfStr;
                        i++;
                        j--;
                        vLeftPos=-1;
                    }else{
                        return firstHalfStr+s.charAt(i)+secondHalfStr;
                    }
                }
            }
        }
        return firstHalfStr+secondHalfStr;
    }
}







    /*//get index of middle char in a string


        int mid  = s.length()/2;
        List<Character> firstHalf = new ArrayList<>();
        List<Character> secondHalf = new ArrayList<>();
        String vowel = "aeiou";
        String firstHalfStr = "";
        String secondHalfStr = "";
        String middleChar = "";
        for(int i=0;i<mid;i++) {
            if(vowel.contains(""+s.charAt(i)))
                firstHalf.add(s.charAt(i));
        }

        for(int i=s.length()-1;i>mid;i--) {
            if(vowel.contains(""+s.charAt(i)))
                secondHalf.add(s.charAt(i));
        }

        for(int i=0;i<mid;i++) {
            if(!vowel.contains(""+s.charAt(i)))
                firstHalfStr = firstHalfStr+s.charAt(i);
            else {

            }

        }*/

