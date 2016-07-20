import java.util.Scanner;

public class digitReverse {
public static void main(String[] args){
	 Scanner scr=new Scanner(System.in);
     System.out.println("Enter the number");
     int number=scr.nextInt();
   StringBuffer str1=new StringBuffer(String.valueOf(number));
     str1.reverse();
     int result=Integer.parseInt(str1.toString());
     System.out.println("reversed number is : "+result);
}
}
