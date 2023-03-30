package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class iterate_through_all_elements //use for each
{

	
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
	for(int i=0;i<n;i++) {
		String s=sc.next();
		arr.add(s);
	}
	for (String element : arr) {
	    System.out.println(element);
	    }
		
		// TODO Auto-generated method stub

	}

}
