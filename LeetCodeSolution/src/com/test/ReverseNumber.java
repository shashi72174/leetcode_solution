package com.test;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = -10;
		System.out.println(reverse(number));
	}
	
	public static int reverse(int number) {
		int remainder = 0;
		int x = number;
		int reverseNumber = 0;
		boolean negflag = false;
		
		if (number == 0)
			return 0;
		
		if(number < 0) {
			negflag = true;
			number = number * -1;
		}
		
		while(number>0) {
			remainder = number % 10;
			number = number / 10;
			reverseNumber = (reverseNumber * 10) + remainder;
		}
		
		if(String.valueOf(x).endsWith("0") && x>0)
			return reverseNumber;
		else if(String.valueOf(x).endsWith("0") && x<0)
			return -reverseNumber;
		
		String reversed = "";
		if(x<0)
			reversed = new StringBuffer(String.valueOf(x*-1)).reverse().toString();
		else
			reversed = new StringBuffer(String.valueOf(x)).reverse().toString();
		
		if(!String.valueOf(reverseNumber).equals(reversed))
			return 0;
		
		if(negflag)
			return Integer.parseInt("-" + reverseNumber);
		else
			return reverseNumber;
		
	}

}
