package programs;

import java.util.Scanner;

public class palindrone {

	public static void main(String[] args) {
		
		
		//== wheher both objs point to same memory, used for integers
		//equals to check equality of content b/w 2 objects
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		
		
		StringBuilder b= new StringBuilder(a);
		
	b.reverse();
	String c=b.toString();
	String ans=a.equals(c) ? "Palindrome" : "Not";
	System.out.println(ans);
	
		// TODO Auto-generated method stub

	}

}
