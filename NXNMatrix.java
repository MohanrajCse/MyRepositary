import java.util.Scanner;


public class NXNMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter N value");
		int N=scr.nextInt();
		System.out.println("Enter Matrix Values");
		int[][] arr=new int[N][N];
		int[][] arr1=new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				arr[i][j]=scr.nextInt();
				arr1[i][j]=arr[i][j];
			}}
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					if(arr[i][j]==0){
						 for(int w=0;w<N;w++)
				            {
				                arr1[i][w]=0;
				               arr1[w][j]=0;
				            }
						
					}
					
				}
				
			}
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					System.out.print(arr1[i][j]+" ");
					
				}
			System.out.println();	
			}
		}

	}


