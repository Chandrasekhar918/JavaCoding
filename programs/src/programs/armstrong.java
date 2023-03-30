package programs;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //153
		int t=n;
		int sum=0;
		int r;
		while(n>0) {
				
		r=n%10; //rem=3, 5, 1
		n=n/10;// num=15 , 1
		
		
		 sum+=r*r*r;
		}
		String ans=sum==t ? "Armstrong" : "Not";
		System.out.println(ans);
		
		
		// TODO Auto-generated method stub

	}

}
