public class ReformatPhoneNumber {

    public static void main(String[] args) {
        String s = "1-23-45 6 ";
        System.out.println(reformatNumber(s));
    }

    public static String reformatNumber(String number) {
        String res = "";
        number = number.replace("-","").replace(" ","");
        int n = number.length();
        if(n<=3)
            return number;
        while(n>0) {
            if(n>4) {
                res += number.substring(0, 3) + "-";
                number=number.substring(3);
                n = n-3;
            }else if(n==3){
                res += number.substring(0, 3);
                number=number.substring(3);
                n = n-3;
            }else if(n==4) {
                res+=number.substring(0,2)+"-"+number.substring(2,4);
                n=0;
            }else {
                res+=number.substring(0,2);
                number=number.substring(2);
                n = n-2;
            }
        }
        return res;
    }
}