import java.util.Scanner;

public class KickerDog {
public static void main(String[] args){
	Scanner scr=new Scanner(System.in);
	System.out.println("Enter Total Moves");
	int total=scr.nextInt();
	int start=1;
	for(int i=0;i<total;i++){
		if(total==start){
			System.out.println("Possible");
		    System.exit(0);	
		}
		if(start>total){
			System.out.println("Not Possible");
            System.exit(0);	
		
		}
	start+=start;	
	}
	
}
}
