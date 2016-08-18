import java.util.Scanner;

public class MohamedChocolate {
public static int mohamedChocolate(int m,int n){
	if(m==0||n==0)
		return 0;
	return (m*n)-1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter M Value");
		int M=scr.nextInt();
		int N=scr.nextInt();
		System.out.println(mohamedChocolate(M, N));
		

	}

}
