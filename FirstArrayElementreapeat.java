package Hunter;

import java.util.Scanner;

public class FirstArrayElementreapeat {

public static void firstArrayElementReapeat(int[] arr){
	int count=0;
	
for(int i=0;i<arr.length;i++){
	count=0;
	for(int j=i+1;j<arr.length;j++){
		if(arr[i]==arr[j]){
			System.out.println("First Array Element reapeat is :"+arr[i]);
			System.exit(0);
		}
			
	}

}
System.out.println("No repeated element");

	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Array length");
		int len=scr.nextInt();
		int[] arr=new int[len];
		System.out.println("Enter Array Elements");
		for(int i=0;i<len;i++){
			arr[i]=scr.nextInt();
		}
		firstArrayElementReapeat(arr);

	}

}
