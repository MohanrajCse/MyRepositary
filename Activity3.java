import java.util.Scanner;


public class Activity3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Pyramid Level");
		n=scr.nextInt();
		int sum=0,l=1,k;
		for(int i=1;i<=n;i++){
			k=l;
			for(int j=i;j<n;j++){
				System.out.print(" ");
			}
			for(int v=1;v<=i;v++){
				System.out.print(k);
				k++;
				if(k>9)
					k=0;
				
			}
		l=k;
		k--;
		for(int w=1;w<i;w++){
			--k;
			if(k<0)
				k=9;
			System.out.print(k);
		}
			
		System.out.println();	

	}

	}}
