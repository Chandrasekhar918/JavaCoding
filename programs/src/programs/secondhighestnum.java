package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class secondhighestnum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
		
		int b=sc.nextInt();
		arr.add(b);
		}
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr);
		System.out.println(arr.get(1));
		
	
	
	
	}
}
