public class IsSubsequence {

    public static void main(String[] args) {
        String s = "aaaaaa", t = "bbaaaa";
        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        int beginIndex = 0;
        for(int i=0;i<s.length();i++) {
            if(t.indexOf(s.charAt(i),beginIndex)==-1)
                return false;
            else
                beginIndex = t.indexOf(s.charAt(i),beginIndex)+1;
        }
        return true;
    }
}