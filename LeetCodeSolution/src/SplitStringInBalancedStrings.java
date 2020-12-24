import java.util.Stack;

public class SplitStringInBalancedStrings {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
    public static int balancedStringSplit(String s) {
        int count = 0;
        int rCount=0;
        int lCount=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='R')
                rCount++;
            else
                lCount++;
            if(rCount==lCount) {
                count++;
                rCount=0;
                lCount=0;
            }
        }
        return count;
    }
}
