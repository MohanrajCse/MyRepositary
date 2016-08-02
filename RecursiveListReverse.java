package Day02082016;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursiveListReverse {
List<Integer> list1 =new ArrayList<>();	
static int b;
public List<Integer> ReverseList(List list){
	b=list.size();
	if(b==0){
	return list1;
		}
	else
	{
		b--;
		list1.add((Integer) list.get(b));
		list.remove(b);
		
		
		return ReverseList(list);
		
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new  ArrayList<>();
		Scanner scr=new Scanner(System.in);
		int number;
		System.out.println("Enter no of elements");
		number=scr.nextInt();
		System.out.println("Enter Values");
		for(int i=0;i<number;i++){
			list.add(scr.nextInt());
		}

RecursiveListReverse obj=new RecursiveListReverse();
System.out.println(obj.ReverseList(list));


	}

}
