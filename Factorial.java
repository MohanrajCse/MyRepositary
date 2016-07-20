import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scr=new Scanner(System.in);
           System.out.println("Enter the number");
           int number=scr.nextInt();
        long sum=1;
           while(number>0){
        	   sum*=number;
        	   number--;
           }
           System.out.println("Factorial is: "+sum);
	}

}
