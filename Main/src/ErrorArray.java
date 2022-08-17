

public class ErrorArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,4};		
        	 try {
        		 ar[3] = 8;
        	 }catch (ArrayIndexOutOfBoundsException e) {
        		 System.err.print(e.getMessage());
        		 System.out.print("Index should be 1 less than Lenght.");
        	 }


	}

}
