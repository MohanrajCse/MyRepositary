import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		 Scanner scr=new Scanner(System.in);
	     System.out.println("Enter the String");
	     String str=new String(scr.next());
	     int number=Integer.parseInt(str);
	     System.out.println("Integer Conversion of given string is : "+number);}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
