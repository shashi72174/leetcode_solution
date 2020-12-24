public class DecodedStringAtIndex {

    public static void main(String[] args) {
        String S="leet2code3";
        int k=10;
        System.out.println(decodeAtIndex(S,k));
    }

    public static String decodeAtIndex(String S, int K) {
        StringBuilder decodedString=new StringBuilder("");
        int i=0;
        while(i<S.length()) {
            if(Character.isDigit(S.charAt(i))) {
                int limit = Integer.parseInt(""+S.charAt(i))-1;
                String s = decodedString.toString();
                for(int j=0;j<limit;j++) {
                    decodedString = decodedString.append(s);
                }
            }else
                decodedString=decodedString.append(S.charAt(i));
            i++;
        }
        return ""+decodedString.charAt(K-1);
    }
}