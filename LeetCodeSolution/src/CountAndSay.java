public class CountAndSay {
    public static void main(String[] args) {
        int n=5;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        String res = "";
        if(n==1)
            return "1";
        res = "1";
        for(int i=2;i<=n;i++) {
            res = count(res);
        }
        return res;
    }

    private static String count(String s) {
        StringBuilder sb = new StringBuilder();
        int j=0;
        char lastCharSeen='\u0000';
        for(int i=0;i<s.length();i++) {
            if(sb.length()==0 && s.length()==1)
                sb.append("" + (++j) + s.charAt(i));
            else {
                if(lastCharSeen=='\u0000')
                    lastCharSeen=s.charAt(i);
                else if(lastCharSeen!=s.charAt(i)) {
                    sb.append("" + j + lastCharSeen);
                    lastCharSeen=s.charAt(i);
                    j=0;
                }
                j++;
                if(i==s.length()-1)
                    sb.append("" + j + s.charAt(i));
            }
        }
        return sb.toString();
    }
}