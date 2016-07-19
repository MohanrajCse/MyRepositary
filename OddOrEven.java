import java.util.Scanner;


public class OddOrEven {

	public static void main(String[] args) {
		int number;
		Scanner scr=new Scanner(System.in);
		 number=scr.nextInt();
		 if(number%2==0)
			 System.out.println("EVEN");
		 else
			 System.out.println("ODD");

	}

}
