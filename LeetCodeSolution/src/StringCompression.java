public class StringCompression {

    public static void main(String[] args) {
        char[] chars = {'a','b'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int count = 0;
        int i=0;
        char prevCharSeen='\u0000';
        if(chars.length==1)
            return 1;
        while(i<chars.length) {
            if(prevCharSeen=='\u0000')
                count+=2;
            else if(prevCharSeen!=chars[i])
                count += 2;
            prevCharSeen = chars[i];
            i++;
        }
        return count;
    }
}