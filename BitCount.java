import java.util.Scanner;

public class BitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Array Length");
		Scanner scr=new Scanner(System.in);
		int len=scr.nextInt();
		System.out.println("Enter array elements");
		int arr[] =new int[len];
		int arr1[]=new int[len];
		for(int i=0;i<len;i++){
			arr[i]=scr.nextInt();
	}
			
	
		for(int k=0;k<len;k++){
			if(k+1<len){
			int a=Integer.bitCount(arr[k+1]);
			int b=Integer.bitCount(arr[k]);
			if(a>b){
				int temp=arr[k];
				arr[k]=arr[k+1];
				arr[k+1]=temp;
				
			}
			else if(a==b){
				if(arr[k+1]>arr[k])
				{
					int temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
			
			}
		}
		System.out.println("Result array is: ");
	for(int i=0;i<arr.length;i++){
		System.out.print("  "+arr[i]);
	}
		

	}

}
