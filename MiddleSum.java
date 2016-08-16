import java.util.Scanner;

public class MiddleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scr=new Scanner(System.in);
 System.out.println("Enter the value of N");
 int N=scr.nextInt();
 int sum=0;
 int[][] arr=new int[N][N];
 
 for(int i=0;i<N;i++){
	 for(int j=0;j<N;j++){
		 arr[i][i]=scr.nextInt();
		 
	 }
	 
 }
 for(int i=1;i<N-1;i++){
	 for(int j=1;j<N-1;j++){
		 sum+=arr[i][j];
	 }
 }
 System.out.println(sum);
	}

}
