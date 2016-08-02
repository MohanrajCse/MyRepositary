package Day02082016;

import java.util.Scanner;

public class MaxElement {

	public static void target(int[] arr,int N){
		int no1=0;
		int no2=0;
		if(arr.length<N){
			System.out.println("Not Possible");
			
		}else{
			int max=0;
			int sum=0;
			int start = 0;
			int end = 0;
			int len=arr.length;
		for(int i=0;i<arr.length;i++){
			if(len>=N){
				
			for(int j=i;j<N;j++){
				
				sum+=arr[i];
				
				
			}
			len--;
			if(sum>max){
				start=i;
				end=i+N;
				
				
			}
			}
			
			
		}
		System.out.println("Max array");
		for(int k=start;k<end;k++){
			System.out.println(arr[k]);
		}
		
	}}
	public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int target;
		System.out.println("Enter length of array");
        int length=scr.nextInt();
        int[] arr=new  int[length];
        System.out.println("Enter Array elements");
        for(int i=0;i<length;i++){
        	arr[i]=scr.nextInt();
        }
        System.out.println("Enter target ");
        target=scr.nextInt();
        target(arr, target);
	}

}
