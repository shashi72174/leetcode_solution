public class NumberComplement {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num));
    }

    public static int findComplement(int num) {
        if(num==1)
            return 0;
        String binary = convertToBinary(num);
        String val = "";
        for(int i=0;i<binary.length();i++) {
            if(binary.charAt(i)=='1')
                val +=0;
            else
                val+=1;
        }
        return convertToDecimal(val);
    }

    private static String convertToBinary(int num) {
        String binary = "";
        int newRem = 0;
        while(num!=0) {
            newRem = num%2;
            binary+=(newRem);
            num = num/2;
        }
        StringBuilder sb = new StringBuilder(binary);
        return sb.reverse().toString();
    }

    private static int convertToDecimal(String num) {
        double res = 0;
        int j=0;
        for(int i=(num.length()-1);i>=0;i--) {
            int n = Character.getNumericValue(num.charAt(i));
            res = res+ n * Math.pow(2, j);
            j++;
        }
        return (int)res;
    }
}