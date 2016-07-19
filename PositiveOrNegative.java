import java.util.Scanner;


public class PositiveOrNegative {


	public static void main(String[] args) {
		int number;
		Scanner scr=new Scanner(System.in);
		 number=scr.nextInt();
		 if(number>0)
			 System.out.println("POSITIVE");
		 if(number<0)
			 System.out.println("NEGATIVE");
		 if(number==0)
			 System.out.println("NEITHER POSITIVE NOR NEGATIVE");

	}

}
