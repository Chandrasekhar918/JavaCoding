package programs;

public class fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int n=4;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);	
		}
		
		
		// TODO Auto-generated method stub

	}

}
