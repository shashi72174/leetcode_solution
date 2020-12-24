public class ThousandSeparator {

    public static void main(String[] args) {
        int n = 987;
        System.out.println(thousandSeparator(n));
    }

    public static String thousandSeparator(int n) {
        String res = "";
        String s = Integer.toString(n);
        int idx = 1;
        int i=s.length()-1;
        while(i>=0) {
            res+=s.charAt(i);
            if(idx==3) {
                if(i!=0)
                    res += ".";
                idx=0;
            }
            i--;idx++;
        }
        return new StringBuilder(res).reverse().toString();
    }
}