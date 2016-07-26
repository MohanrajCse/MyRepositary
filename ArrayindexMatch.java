package Hunter;

import java.util.Scanner;

public class ArrayindexMatch {
public static void arrayIndexMatch(int[] arr){
	int count=0;
	for(int i=0;i<arr.length;i++){
		if(i==arr[i]){
			System.out.println("Array Index and value match at : "+i);
			count++;
		
	}
		
	}
	if(count==0)
	System.out.println("Array Index and Value Not Matched");
	
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
		arrayIndexMatch(arr);

	}

}
