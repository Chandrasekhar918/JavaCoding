package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class creating_arraylist {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
	for(int i=0;i<n;i++) {
		String s=sc.next();
		arr.add(s);
	}
System.out.println(arr);
		
		// TODO Auto-generated method stub

	}

}
