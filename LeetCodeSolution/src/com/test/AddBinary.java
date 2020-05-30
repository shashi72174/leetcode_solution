package com.test;

public class AddBinary {

	public static void main(String[] args) {
		String a = "1011";
		String b = "1011";
		System.out.println(addBinary(a, b));
	}
	
	public static String addBinary(String a, String b) {
		String result = "";
		if(a.length()<b.length())
			a = prependZero(a, b.length()-a.length());
		else if(a.length()>b.length())
			b = prependZero(b, a.length()-b.length());
		int sum = 0, carry = 0;
		for(int i=a.length()-1;i>=0;i--) {
			sum = sum + new Integer(""+a.charAt(i))+new Integer(""+b.charAt(i));
			if(sum==2 && carry==0) {
				result = "0" + result;
				carry = 1;
			}else if(sum==2 && carry==1) {
				result =  "1" + result;
				carry = 1;
			}else if(sum==1 && carry==1) {
				result = "0" + result;
				carry = 1;
			}else if(sum==0 && carry==1) {
				result = "1" + result;
				carry = 0;
			}else 
				result = sum + result;
			sum=0;
		}
        return carry==1 ? carry+result: result;
    }
	
	private static String prependZero(String s,int times) {
		for(int i=0;i<times;i++) 
			s="0"+s;
		return s;
	}
}