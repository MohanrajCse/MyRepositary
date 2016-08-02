package Day02082016;

import java.util.Scanner;

public class TargetNumber {

	public static void target(int[] arr,int target){
		int no1=0;
		int no2=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(j+1<arr.length&&arr[j]+arr[j+1]==target){
					no1=arr[i];
					no2=arr[i+1];
					break;
				}
			}
			
		}
		System.out.println("Two numbers are :");
		System.out.println(no1+"   "+no2);
	}
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
