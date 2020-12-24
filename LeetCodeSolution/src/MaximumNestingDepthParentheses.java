public class MaximumNestingDepthParentheses {

    public static void main(String[] args) {
        String s = "1+(2*3)/(2-1)";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int maxDepth = 0,depth = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='(')
                depth++;
            else if(s.charAt(i)==')') {
                if(depth>maxDepth)
                    maxDepth=depth;
                depth--;
            }
        }
        return maxDepth;
    }
}