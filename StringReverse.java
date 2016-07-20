import java.util.Scanner;

public class StringReverse {
public static void main(String[] args){
	Scanner scr=new Scanner(System.in);
	StringBuffer string=new StringBuffer(scr.next());
	System.out.println("Reversed String is: "+string.reverse());
}
}
