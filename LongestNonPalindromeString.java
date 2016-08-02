package Day02082016;

import java.util.Scanner;

public class LongestNonPalindromeString {
      public static int longest(String string){
    	  if(string.length()%2==0)
    		  return string.length();
    	  else
    		  return string.length()-1;
    	  
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		String string;
		System.out.println("Enter the string");
		string=scr.next();
		System.out.println("Length " +longest(string));
        
	}

}
