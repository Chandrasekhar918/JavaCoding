package programs;

import java.util.Scanner;

public class primeornnot {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();//10,11
		//int n=69;
		int c=1;
		for(int i=2;i<=n/2;i++) {//2,5
			if(n%i==0) {//10%2=0,10%3!=0;10%4!=0,10%5=0>
				c+=1; //c==2
				System.out.println(i);
			}
			
		}
		String s=(c==1) ? "Prime" : "Not Prime";
		System.out.println(s);
		// TODO Auto-generated method stub

	}

}
