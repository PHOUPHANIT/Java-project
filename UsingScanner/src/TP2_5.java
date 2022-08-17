import java.util.*;
public class TP2_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nProgram for guessing your luckiness.");
		System.out.print("\nlease input a positive number: ");
		int n = sc.nextInt();
	    n=n+1;
		System.out.print("\nI got "+n+". I am luckier.");

		sc.close();
	}

}
