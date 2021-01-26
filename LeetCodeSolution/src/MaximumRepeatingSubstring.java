public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba",
                "aaaba"));
    }

    public static int maxRepeating(String sequence, String word) {
        int count = 0,i=0;
        while(i<sequence.length()) {
            String temp = sequence.substring(0,word.length());
            if(temp.equals(word))
                count++;
            sequence = sequence.substring(word.length());
        }
        return count;
    }
}
