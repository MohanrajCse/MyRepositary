

import java.util.Scanner;

public class SumOfPower4 {
	public static int output1;

public static void userMethod(int number){
	int sum=1;
	int len=0;
	int result=0;
	String str1=String.valueOf(number);
	for(int i=0;i<str1.length();i++){
		sum=1;
		if(i==str1.length()-1)
			{
			result+=1;
			break;
			}
		else{
			len=str1.charAt(i+1)-48;}
	for(int j=0;j<len;j++){
			sum*=(str1.charAt(i)-48);
		}
	result += sum;
	}
	output1=result;
	System.out.println(output1);
}
	public static void main(String[] args) {

		Scanner scr=new Scanner(System.in);
		int number=scr.nextInt();
		userMethod(number);
		
	}

}
