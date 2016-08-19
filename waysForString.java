import java.util.Scanner;


public class waysForString {

 public static void waysForString(String str){
	 String tmp="";
	 int count=0;
	 for(int i=0;i<str.length();i++){
		 tmp+=(char)((str.charAt(i)-48)+96);
	 }
	 count++;
	 System.out.println(tmp);
	
	 for(int i=0;i<str.length()-1;i++){
		 tmp="";
		 int a=Integer.parseInt(str.substring(i,i+2));
		 if(a<=26){
			 for(int j=0;j<str.length();j++){
				 if(j==i){
					 tmp+=(char)(a+96);
					 j++;
				 }
				 else
					 tmp+=(char)((str.charAt(j)-48)+96);
			 }
			 System.out.println(tmp);
			 count++;
			 
		 }
	 }
	 tmp="";
	 int l=str.length()/2;
	 float l2=str.length()/2f;
	 if(l!=l2)
		 l=l+1;
	 
	 for(int i=0;i<l;i++){
		
		 if(str.length()%2==0){
		 int a=Integer.parseInt(str.substring(i,i+2));
		 tmp+=(char)(a+96);
		 }
		 else{
			 if(i==str.length()-1)
				 tmp+=(char)((str.charAt(i)-48)+96);
			 else{
				 int a=Integer.parseInt(str.substring(i,i+2));
				 tmp+=(char)(a+96); 
			 }
		 }
	 }
	 System.out.println(tmp);
	 count++;
	 System.out.println("Count is"+count);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scr.nextInt();
 		String str=String.valueOf(number);
        waysForString(str);
	}

}
