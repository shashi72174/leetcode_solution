import java.util.*;

public class UniqueMorseCodeWords {

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] alphabetCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String,Integer> wordCodeCount = new HashMap<>();
        for(String s : words) {
            String temp = "";
            for(int i=0;i<s.length();i++)
                temp+=alphabetCodes[(int)s.charAt(i) - 97];
            if(wordCodeCount.containsKey(temp))
                wordCodeCount.put(temp, wordCodeCount.get(temp)+1);
            else
                wordCodeCount.put(temp, 1);
        }
        return wordCodeCount.size();
    }
}