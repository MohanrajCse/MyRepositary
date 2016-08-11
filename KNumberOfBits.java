import java.util.Scanner;

public class KNumberOfBits {
public static void KNo(int k){
	int i=0;
	while(i<=k){
		for(int j=0;j<Math.pow(2, k);j++){
			String a=Integer.toBinaryString(j);
		
			int count=Integer.bitCount(j);
			if(count==i)
				System.out.println(String.format("%0"+k+"d", Integer.parseInt(a)));
			
			
		}
		i++;
		
	}
	
	
}
public static void main(String[] args){
	Scanner scr=new Scanner(System.in);
	System.out.println("Enter K value");
	int k=scr.nextInt();
	KNo(k);
}
}
