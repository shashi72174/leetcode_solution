public class ShuffleString {
    public static void main(String[] args) {
        String str = "aiohn";
        int[] indicies = new int[] {3,1,4,2,0};
        System.out.println(restoreString(str,indicies));
    }

    public static String restoreString(String s, int[] indices) {
        String shuffleString = "";
        int counter=0;
        int i=0;
        while(i<indices.length && counter<s.length()) {
            if(indices[i]==counter) {
                shuffleString = shuffleString + s.charAt(i);
                i=0;
                counter++;
            }else
                i++;
        }
        return shuffleString;
    }
}