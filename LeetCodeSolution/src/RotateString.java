public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString(String A, String B) {
        int i=0;
        StringBuilder sb = new StringBuilder(A);
        if(A.equals(B))
            return true;
        int n = A.length();
        while(i<n) {
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
            if (sb.toString().equals(B))
                return true;
            i++;
        }
        return false;
    }
}