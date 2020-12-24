import java.util.*;

public class RearrangeWordsInASentence {

    public static void main(String[] args) {
        String text = "Keep calm and code on";
        System.out.println(arrangeWords(text));
    }

    public static String arrangeWords(String text) {
        String[] splitArr = text.split(" " );
        Arrays.sort(splitArr, (o1, o2) ->  (o1.length()>o2.length()) ? 1 : (o1.length()<o2.length()) ? -1 : 0);
        String s1 = String.join(" ", splitArr);
        s1 = s1.trim().toLowerCase();
        return (""+s1.charAt(0)).toUpperCase()+s1.substring(1);
    }
}