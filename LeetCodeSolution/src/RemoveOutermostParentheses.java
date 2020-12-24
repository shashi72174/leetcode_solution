import java.util.Stack;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s="(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int open=0, close=0, start=0;
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '(') {
                open++;
            } else if(S.charAt(i) == ')') {
                close++;
            }
            if(open==close) {
                sb.append(S.substring(start+1, i));
                start=i+1;
            }
        }
        return sb.toString();
    }
}
/*

else if(s.charAt(i)==')') {
                if(stack.size()==1)
                    stack.pop();
                else
                    res = ""+stack.pop()+s.charAt(i)+res;
            }
 */