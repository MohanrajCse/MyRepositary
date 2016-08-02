package Day02082016;

import java.util.ArrayList;
import java.util.Scanner;

public class IntervieQueue {
	public static int Interview(ArrayList list){
		if(list.size()==1)
			return (int) list.get(0);
		else
		{
			for(int j=1;j<list.size();j=j+2){
				list.remove(j);
			}
			return Interview(list);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In this scenario I assume that new queue may be in ordered by only in the selected format.
		Scanner scr=new Scanner(System.in);
		ArrayList<Integer> list =new ArrayList<>();
		System.out.println("Enter Number of Persons");
		int no=scr.nextInt();
		for(int i=1;i<=no;i++){
			list.add(i);
		}
		
System.out.println("Position is "+Interview(list));
	}

}
