package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class insert_element_at_first_position {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String t=sc.next();
		
	for(int i=0;i<n;i++) {
		String s=sc.next();
		arr.add(s);
	}
Collections.reverse(arr);
System.out.println(arr.size());

		// TODO Auto-generated method stub

	}

}
