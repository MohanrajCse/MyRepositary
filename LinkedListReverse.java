package Day24082016;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListReverse {
	public static void ReverseLinkedList(LinkedList list){
		LinkedList list2=new LinkedList<>(list);
		
		Collections.reverse(list);
		
		
	
		if(list.equals(list2))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
	public static void main(String[] args){
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter no of nodes");
		int n=scr.nextInt();
		LinkedList list=new LinkedList<>();
		for(int i=0;i<n;i++){
			char a=scr.next().charAt(0);
			list.add(a);
		}
		ReverseLinkedList(list);
	}

}
