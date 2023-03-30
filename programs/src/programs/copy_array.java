package programs;

public class copy_array {

	public static void main(String[] args) {
		int arr[]= {1,6,15,5};
		
		
		
		for(int i=0;i<arr.length;i++) { 
			for(int j=i+1;j<arr.length;j++) {  
				if(arr[j]==arr[i]) { //6==6,
					System.out.println(arr[j]);
				}
			}
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
