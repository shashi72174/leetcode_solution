public class GoalParserInterpretation {

    public static void main(String[] args) {
        String s = "(al)G(al)()()G";
        System.out.println(interpret(s));
    }

    public static String interpret(String command) {
        String res = "";
        int i=0;
        while(i<command.length()) {
            if(command.charAt(i)=='(') {
                if((i+1)<command.length() && command.charAt(i+1)==')'){
                    i++;
                    res = res+"o";
                }
            }else if(command.charAt(i)!=')')
                res = res+command.charAt(i);
            i++;
        }
        return res;
    }
}