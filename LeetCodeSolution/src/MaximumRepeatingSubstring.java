public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));
    }

    public static int maxRepeating(String sequence, String word) {
        int count = 0;
        String temp = word;
        while(sequence.contains(temp)) {
                count++;
                temp+=word;
        }
        return count;
    }
}
