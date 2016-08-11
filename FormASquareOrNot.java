import java.util.Scanner;
import java.lang.*;
public class FormASquareOrNot {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scr=new Scanner(System.in);
       System.out.println("Enter co-ordinates");
       int[] arr=new int[8];
       for(int i=0;i<8;i++){
    	 
    	   arr[i]=scr.nextInt();
    	   
    	   
       }
      
       int d1=Math.abs(Math.abs(arr[1])-Math.abs(arr[3]));
       int d2=Math.abs(Math.abs(arr[2])-Math.abs(arr[4]));
       int d3=Math.abs(Math.abs(arr[5])-Math.abs(arr[7]));
       int d4=Math.abs(Math.abs(arr[6])-Math.abs(arr[0]));
       if(d1==d2&&d1==d3&&d1==d4)
    	   System.out.println("It form square");
       else
    	   System.out.println("Not a square");
	}
	

}
