public class RemoveAllAdjacentDuplicatesString {
    public static void main(String[] args) {
        String s = "abbacaa";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while(i<=sb.length()-2) {
            if(sb.charAt(i)!=sb.charAt(i+1))
                i++;
            else {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i=0;
            }
        }
        return sb.toString();
    }
}