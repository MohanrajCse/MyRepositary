package Day24082016;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatedRegNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new LinkedHashSet<>();
		int count=0;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int no=scr.nextInt();
		int[] arr=new int[no];
		System.out.println("Enter Array Elements");
		for(int i=0;i<no;i++){
			arr[i]=scr.nextInt();
		}
		System.out.println("Duplicates Elements are :");
		for(int i=0;i<no;i++){
			if(set.contains(arr[i])){
				System.out.println(arr[i]);
				count++;
			}
			else{
				set.add(arr[i]);
			}
		}
if(count==0)
	System.out.println("No Duplicates found");
	}

}
