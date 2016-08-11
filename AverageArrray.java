import java.util.Scanner;

public class AverageArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Number of elements in array");
		int len=scr.nextInt();
		int[] arr=new int[len];
		int len1=len/2;
		int val1=0,val2=0;
		float avg1,avg2;
		System.out.println("Enter Values");
		for(int i=0;i<len1;i++){
			arr[i]=scr.nextInt();
			val1+=arr[i];
		}
 
for(int j=len1;j<len;j++){
	arr[j]=scr.nextInt();
	val2+=arr[j];
}

avg1=val1/len1;
avg2=val2/(len-len1);
if(avg1==avg2)
	System.out.println("Possible");
else
	System.out.println("Not Possible");
	}
}
