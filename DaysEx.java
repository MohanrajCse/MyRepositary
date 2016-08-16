
import java.util.Scanner;

public class DaysEx {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr=new String[7];
			
			  arr[0]=new String();
			  arr[0]="sunday";
			  arr[1]=new String();
			  arr[1]="monday";
			  arr[2]=new String();
			  arr[2]="tuesday";
			  arr[3]=new String();
			  arr[3]="wednesday";
			  arr[4]=new String();
			  arr[4]="thursday";
			  arr[5]=new String();
			  arr[5]="friday";
			  arr[6]=new String();
			  arr[6]="saturday";
			
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter starting day");
		String day=scr.nextLine();
		System.out.println("Enter year Type");
		String type=scr.nextLine();
		int index=0;
		for(int i=0;i<7;i++){
			if(day.equals(arr[i]))
				index=i;
		}
		if(index%2==0){
		for(int j=0;j<7;j=j+2)
			System.out.println(arr[j]);
		

	}
		if(index%2==1){
			for(int j=1;j<7;j=j+2)
				System.out.println(arr[j]);
			

			
	}
		if(type.equals("leap"))
			System.out.println(arr[index+1]);

}}
