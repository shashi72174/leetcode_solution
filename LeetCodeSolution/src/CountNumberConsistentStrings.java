public class CountNumberConsistentStrings {
    public static void main(String[] args) {
        String allowed = "cad";String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings(allowed,words));

    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;boolean valid = true;
        for(String s : words) {
            valid=true;
            for(int i=0;i<s.length();i++) {
                if(!allowed.contains(""+s.charAt(i))) {
                    valid=false;
                    break;
                }
            }
            if(valid)
                count++;
        }
        return count;
    }
}