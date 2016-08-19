package LC9;

import java.util.Scanner;

public class SumOfPower1 {
public static int output1;
public static void userMethod(int number){
	int result=0;
	int sum=0;
	String str1=String.valueOf(number);
	int len=str1.length();
	for(int i=0;i<len;i++){
		sum=1;
		for(int j=0;j<len;j++){
		
			sum*=(str1.charAt(i)-48);
		}
		result+=sum;
	}
	output1=result;
System.out.println(result);
}
	
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int number=scr.nextInt();
		userMethod(number);
		
	}

}
