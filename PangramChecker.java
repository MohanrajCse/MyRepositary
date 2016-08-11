import java.util.Scanner;

public class PangramChecker {
	public static int pangram(String str){
		for(char c='a';c<='z';c++){
			if(!str.contains(c+"")){
			return -1;
			}
			
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		String str=scr.nextLine();
	if(	pangram(str.toLowerCase())!=-1)
		System.out.println("String is Pangram");
	else 
		System.out.println("String is Not a Pangram");

	}

}
