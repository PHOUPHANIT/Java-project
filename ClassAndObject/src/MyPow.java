
public class MyPow {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.print("Usage: java myPow <base> <expo>");
			
		}else {
		 /*   Integer.parseInt(args[0]);
		    Integer.parseInt(args[1]);*/
			
		double n1 =	Double.parseDouble(args[0]);
		double n2 =	Double.parseDouble(args[1]);
			
			double n3 = Math.pow(n1,n2);
			System.out.print(args[0]+"^"+args[1]+"="+n3);
		}

	}

}
