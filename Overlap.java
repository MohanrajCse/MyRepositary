import java.util.Scanner;

public class Overlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter rectangle 1 coOrdinates");
        int[] x1=new int[8];
        for(int i=0;i<8;i++)
        	x1[i]=scr.nextInt();
    	System.out.println("Enter rectangle 2 coOrdinates");
        int[] x2=new int[8];
        for(int i=0;i<8;i++)
        	x2[i]=scr.nextInt();
        if((x1[2]>x2[6]||x2[2]>x1[6]||x1[3]>x2[7]||x2[3]>x2[7]))
            System.out.println("Possible");
        else 
        	System.out.println("Not Possible");
}}
