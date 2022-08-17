

public class useDataType {
	
		
		public void Age() {
		//Create local variable
			 int age = 10;
			 age = age +17;
			
			System.out.println("Your age is "+age);
		}
	
		//Create instance variable
		public String name;     //visible for any child class
//		private double Salary;  //visible in main class only
		
		
		   // salary  variable is a private static variable
//		   private static double salary;

		   // DEPARTMENT is a constant
		   public static final String DEPARTMENT = "Development ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Basic data types
		
		byte w = 68;
		char s = 'A';
		int a = s;
		
		long l = 100000000L;
		double d  = 123.23;//float
		
	    String name = "\'\rHello world!\"";
		
		
		System.out.println("Number A = "+a);
		
	    System.out.println(l);
	    System.out.println(w);
	    System.out.println(d);
	    System.out.println(name);
	    
	    
	    //Variable type
	    //Use Local variable in main program
	    
	    useDataType t = new useDataType();
	    t.Age();
	    
	}

}
