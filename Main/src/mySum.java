
public class mySum {

	
	public static int DivEx(int a, int b) throws Exception {
		if(b==0) {
			throw new Exception("Error: b must be not zero.");
		}else {
			return a/b;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a =0 ,b =5;
			System.out.printf("%d / %d = %d\n",a,b,DivEx(a,b));
		}catch(Exception e) {
            System.out.println(e.getMessage());			
		}

	}

}
