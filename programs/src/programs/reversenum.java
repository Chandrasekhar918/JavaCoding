package programs;

public class reversenum {

	public static void main(String[] args) {
		long n=123456;
		long r,s;
		for(int i=0;i<=n;i++) {
			
			r=n%10; // 4 3 2
			System.out.print(r);
			n=n/10;// 123 12 1
			if(n==1) {
				System.out.print(1);
			}
			
		}
	
		// TODO Auto-generated method stub

	}

}
