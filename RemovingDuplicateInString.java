package Day02082016;

import java.util.Scanner;

public class RemovingDuplicateInString {
	public static String removeDuplcate(String string){
		String result="";
		for(int i=0;i<string.length();i++){
		if(result.contains(string.charAt(i)+"")){
			
		}
		else
			result+=string.charAt(i);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		String string;
		System.out.println("Enter the string");
		string=scr.next();
		System.out.println("After Removing "+removeDuplcate(string));
	}

}
