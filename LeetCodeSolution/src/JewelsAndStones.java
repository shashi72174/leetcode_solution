public class JewelsAndStones {
    public static void main(String[] args) {
        String J = "z", S = "ZZ";
        System.out.println(numJewelsInStones(J,S));
    }


    public static int numJewelsInStones(String J, String S) {
        int count=0;
        if(J.length()==0 || S.length()==0)
            return 0;
        for(int i=0;i<J.length();i++) {
            for(int j=0;j<S.length();j++) {
                if(J.charAt(i)==S.charAt(j))
                    count++;
            }
        }
        return count;
    }
}
