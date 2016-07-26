package Hunter;

import java.util.Scanner;

public class StringReverseByWord {
	public static String stringReverseByWord(String str){
		String[] str1=str.split(" ");
		String output="";
		for(int i=0;i<str1.length;i++){
			StringBuffer buff=new StringBuffer(str1[i]);
			output+=buff.reverse().toString()+" ";
		}
		return output.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scr.nextLine();
		System.out.println(stringReverseByWord(str));

	}

}
