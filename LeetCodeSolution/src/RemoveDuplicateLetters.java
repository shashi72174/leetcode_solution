public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        removeDuplicateLetters(s);
    }

    public static String removeDuplicateLetters(String s) {
        String res = "";
        if(s.length()==1)
            return s;
        int i=0;
        while(i<s.length()) {
            if(s.indexOf(s.charAt(i),i+1)==-1)
                res+=s.charAt(i);

            i++;
        }
        return res;
    }
}
