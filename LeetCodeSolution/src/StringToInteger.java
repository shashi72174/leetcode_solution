import java.math.BigInteger;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("20000000000000000000"));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        String res = "";
        boolean isSignEncountered = false; char prevChar = '\u0000';

        if(s.length()==1 && (s.charAt(0)=='+' || s.charAt(0)=='-'))
            return 0;
        for(int i=0;i<s.length();i++) {
            if(Character.isSpaceChar(s.charAt(i)))
                break;
            else if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == '.')
                break;
            else if(Character.isDigit(prevChar) && s.charAt(i)=='.')
                break;
            else if(Character.isDigit(prevChar) && (s.charAt(i)=='-' || s.charAt(i) == '+'))
                break;
            else if(isSignEncountered && (s.charAt(i)=='-' || s.charAt(i) == '+'))
                return 0;
            else if(s.charAt(i)=='-' || s.charAt(i)=='+') {
                isSignEncountered = true;
                res += s.charAt(i);
            }else if(Character.isDigit(s.charAt(i)))
                res+=s.charAt(i);
            prevChar = s.charAt(i);
        }

        long val = 0;
        if(!res.equals(""))
            val = Long.parseLong(res);
        else
            return 0;
        if(val<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else if(val>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return Integer.parseInt(res);
    }
}
