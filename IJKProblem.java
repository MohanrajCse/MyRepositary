package Hunter;

import java.util.Scanner;

public class IJKProblem {

public static void ijkProblem(int[] arr){
for(int i=0;i<arr.length;i++){
	if(i+2<arr.length&&arr[i]+arr[i+1]==arr[i+2]){
		System.out.println("I Value is "+arr[i]);
		System.out.println("J Value is "+arr[i+1]);
		System.out.println("K Value is "+arr[i+2]);
		System.exit(0);
	}
}
System.out.println("No Such Expression Matched");
	
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
		ijkProblem(arr);

	}

}
