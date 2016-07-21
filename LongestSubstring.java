import java.util.Scanner;


public class LongestSubstring {

	
	public static void main(String[] args) {
	Scanner scr =new Scanner(System.in);
	String str=scr.next();
	String largeSubString="";
	for(int i=1;i<str.length();i++){
		 int a=str.charAt(i)-str.charAt(i-1);
		 if(a>0){
			 largeSubString=str.substring(i);
			 break;
			 
		 }
	}
	if(largeSubString.length()==0){
		System.out.println("No Such Largest SubString Present");
	}
	else
		System.out.println("Largest Substring is : "+largeSubString);
	}

}
