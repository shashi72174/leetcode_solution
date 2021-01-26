public class ReformatTheString {
    public static void main(String[] args) {
        System.out.println(reformat("a0b1c2"));
    }

    public static String reformat(String s) {
        int countDigits = 0, countAlpha = 0;
        String res = "", digit = "", alpha = "";
        if(s.length()==1)
            return s;
        for(int i=0;i<s.length();i++) {
            if((int)s.charAt(i)<58 && (int)s.charAt(i)>47) {
                countDigits++;
                digit +=s.charAt(i);
            }else {
                countAlpha++;
                alpha += s.charAt(i);
            }
        }
        if(countAlpha==0 || countDigits==0)
            return res;
        if(countAlpha>countDigits) {
            for(int i=0;i<countAlpha;i++) {
                if(i<countDigits)
                    res+=""+alpha.charAt(i)+digit.charAt(i);
                else
                    res+=""+alpha.charAt(i);
            }
        }else {
            for(int i=0;i<countDigits;i++) {
                if(i<countAlpha)
                    res+=""+digit.charAt(i)+alpha.charAt(i);
                else
                    res+=""+digit.charAt(i);
            }
        }
        return res;
    }
}