package Array;
import java.util.Scanner;

public class ArraygetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner input = new Scanner(System.in)){
		
		/*String[] gender;	
		double[] salary;*/
		String[] firstname = new String[3];
		String[] lastname = new String[3];
		int[] age = new int[3];
		String[] pnumber = new String[3];
		
		for(int i=0;i<2;i++) {
			System.out.print("Enter your firstname: ");
			firstname[i] = input.next();	
			System.out.print("Enter your lastname: ");
			lastname[i] = input.next();
			System.out.print("Enter your age: ");
			age[i] = input.nextInt();
			System.out.print("Enter your phone number: ");
			pnumber[i] = input.next();
		}
		
		System.out.print("\nFirstname\tLastname\tAge\tPhone_number\n");
		for(int i=0;i<2;i++) {
			System.out.println(firstname[i]+"\t"+lastname[i]+"\t"+age[i]+"\t"+pnumber[i]);
		}	
		input.close();
	  }
	}
}
