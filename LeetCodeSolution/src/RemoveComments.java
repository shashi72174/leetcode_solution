import java.util.*;

public class RemoveComments {

    public static void main(String[] args) {
        //String[] source = {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
        //String[] source = {"a/*comment", "line", "more_comment*/b"};
        //String[] source = {"main() { ", "  int a = 1; /* Its comments here ", "", "  ", "  */ return 0;", "} "};
        //String[] source = {"class test{", "public: ", "   int x = 1;", "   /*double y = 1;*/", "   char c;", "};"};
        String[] source = {"struct Node{", "    /*/ declare members;/**/", "    int size;", "    /**/int val;", "};"};
        System.out.println(removeComments(source));
    }

    public static List<String> removeComments(String[] source) {
        List<String> list = new ArrayList<>();
        boolean isBlockCommment = false,isContinued=false;
        String temp = "";
        for(String s : source) {
            if(s.contains("//") && s.indexOf("//")==0)
                continue;
            else if(s.contains("/*") && s.indexOf("/*")==0 && s.contains("*/"))
                continue;
            else if(s.contains("/*") && s.indexOf("/*")!=0 && s.contains("*/")) {
                String temp1 = s.substring(0, s.indexOf("/*"));
                if(s.lastIndexOf("*/")!=s.length()-2)
                    temp1 = temp1+s.substring(s.indexOf("*/")+2);
                list.add(temp1);
            }else if(s.contains("/*") && s.indexOf("/*")==0) {
                isBlockCommment=true;
                continue;
            }else if(s.contains("*/") && isContinued && isBlockCommment) {
                temp = temp + s.substring(s.indexOf("*/") + 2);
                list.add(temp);
                temp="";
                isContinued=false;
                isBlockCommment=false;
            }else if(s.contains("*/") && isBlockCommment) {
                isBlockCommment=false;
                continue;
            }else if(!s.contains("/*") && isBlockCommment)
                continue;
            else if(!s.contains("//") && !s.contains("/*") && !isBlockCommment)
                list.add(s);
            else if(s.contains("//") && s.indexOf("//")!=0)
                list.add(s.substring(0,s.indexOf("//")));
            else if(s.contains("/*") && s.indexOf("/*")!=0) {
                temp = temp+s.substring(0, s.indexOf("/*"));
                isContinued=true;
                isBlockCommment=true;
            }
        }
        return list;
    }
}