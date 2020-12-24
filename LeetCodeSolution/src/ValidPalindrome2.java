public class ValidPalindrome2 {

    public static void main(String[] args) {
        String s = "ebcbbececabbacecbbcbe";//String s = "abc";        //String s = "aba";        String s = "abca";        //String s = "abbcda";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean isAlreadyDeleted = false;
        int i=0,j=sb.length()-1;
        while(i<j) {
            if(sb.charAt(i)!=sb.charAt(j)){
                if(!isAlreadyDeleted) {
                    isAlreadyDeleted = true;
                    if(sb.charAt(i+1)==sb.charAt(j))
                        sb.deleteCharAt(i);
                    else
                        sb.deleteCharAt(j);
                }else
                    return false;
            }else
                i++;j--;
        }
        return true;
    }
}