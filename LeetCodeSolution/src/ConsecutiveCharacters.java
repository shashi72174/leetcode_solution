public class ConsecutiveCharacters {
    public static void main(String[] args) {
        System.out.println(maxPower( "tourist"));
    }

    public static int maxPower(String s) {
        int maxPower = 0,power = 0;
        char prevChar = '\u0000';

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==prevChar)
                maxPower = Math.max(maxPower,++power);
            else {
                power = 0;
                maxPower = Math.max(maxPower,++power);
            }
            prevChar = s.charAt(i);
        }
        return maxPower;
    }
}