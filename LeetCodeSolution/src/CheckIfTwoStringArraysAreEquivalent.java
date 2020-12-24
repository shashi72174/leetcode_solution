public class CheckIfTwoStringArraysAreEquivalent {

    public static void main(String[] args) {
        String[] word1 = {"a", "cb"}, word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "",s2 = "";
        for(String s: word1) {
            s1+=s;
        }
        for(String s: word2) {
            s2+=s;
        }
        return s1.equals(s2);
    }
}