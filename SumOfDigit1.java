package LC9;

import java.util.Scanner;

public class SumOfDigit1 {
 public static int output1;
 public static void userMethod(int number){
	 String str1=String.valueOf(number);
		
		
		int result=0;
		if(number>9){
		for(int i=0;i<str1.length();i++){
			for(int j=0;j<str1.length()-i;j++ ){
				result+=(str1.charAt(j)-48);
				}
		}
		output1=result;
		System.out.println(result);
		}
 }

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int number=scr.nextInt();
		
		userMethod(number);

	}

}
