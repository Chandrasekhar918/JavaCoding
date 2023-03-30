package programs;

import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//153
		int r;
		int sum=0;
		while(n>0) {
			r=n%10;//3
			n=n/10;//15
			sum+=r;  //3+5+1
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
