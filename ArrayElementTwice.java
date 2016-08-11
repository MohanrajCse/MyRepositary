package Hunter;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayElementTwice {
public static void main(String[] args){
	Scanner scr=new Scanner(System.in);
	HashMap<Integer, Integer> hash=new HashMap<>();
	System.out.println("Enter Size of array");
	int count1=0;
	
	int len=scr.nextInt();
	System.out.println("Enter Array Elements");
	int[] arr=new int[len];
	for(int i=0;i<len;i++){
		arr[i]=scr.nextInt();
		if(hash.containsKey(arr[i])){
			hash.put(arr[i], hash.get(arr[i])+1);}
			else
				hash.put(arr[i],1);
		}
	for(int i=0;i<hash.size();i++){
		if(hash.get(arr[i])==2){
			
		}
		else if(hash.get(arr[i])==1){
			count1++;
		if(count1>1)
		{
			System.out.println("Not Valid");
			System.exit(0);
		}
		}
		else{
			System.out.println("Not Valid");
		System.exit(0);	
		}
	}
	System.out.println("Valid");
	}
	
}

