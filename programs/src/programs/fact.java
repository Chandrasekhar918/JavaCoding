package programs;

public class fact {
	
	int f=1;
	public int fac(int n) {
		for(int i=1;i<=n;i++) {
			f=f*i;
			
	}
		return f;
		
//	static int f=1;
//	public static int fac(int n) {
//		for(int i=1;i<=n;i++) {  //5
//			f=f*i;
//		}
//		return f;
//		
		
		
	}

	public static void main(String[] args) {
		int n=5;
	fact res=new fact();
	System.out.println(res.fac(n));
		
		// TODO Auto-generated method stub

	}

}
