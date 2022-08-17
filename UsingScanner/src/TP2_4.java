
import java.util.*;
public class TP2_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Program for counting the number of hundreds.");
		System.out.print("\nlease input a positive number: ");
		int n = sc.nextInt();
		
		System.out.print("There are "+n/100+" hundreds in number "+n+" .");

		sc.close();
	}

}
