public class MakeTheStringGreat {

    public static void main(String[] args) {
        String s = "leEEetCode";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        int i = 1;
        StringBuilder res = new StringBuilder("" + s.charAt(0));
        while (i < s.length()) {
            if(res.length()==0)
                res.append(s.charAt(i));
            else if ((int) res.charAt(res.length() - 1) < 91) {
                if ((int) res.charAt(res.length() - 1) + 32 != (int) s.charAt(i))
                    res.append(s.charAt(i));
                else
                    res.deleteCharAt(res.length() - 1);
            } else if ((int) res.charAt(res.length() - 1) > 96 && (int) res.charAt(res.length() - 1) < 123) {
                if ((int) res.charAt(res.length() - 1) - 32 != (int) s.charAt(i))
                    res.append(s.charAt(i));
                else
                    res.deleteCharAt(res.length() - 1);
            }
            i++;
        }
        return res.toString();
    }
}