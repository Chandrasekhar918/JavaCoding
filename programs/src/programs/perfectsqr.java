package programs;

public class perfectsqr {

	public static void main(String[] args) {
		long s=431;
		double t= Math.sqrt(s);
		System.out.println(t);
		if(t-Math.floor(t)==0) {
			System.out.println("Perfect square");
		}
		else {
			System.out.println("Not");
		}
		System.out.println(Math.floor(t));
		// TODO Auto-generated method stub

	}

}
