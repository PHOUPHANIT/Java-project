import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		int a = 5;

		int b = 0;

		Scanner sc = new Scanner(System.in);

		do {

			try {

				System.out.print("Input a: ");

				a = Integer.parseInt(sc.nextLine());

				break;

			} catch (NumberFormatException e) {

				System.err.println(e.getMessage());

				System.out.println("Please try input again.");

			}

		} while (true);

		
		
		
		
		System.out.print("Input b: ");

		b = Integer.parseInt(sc.nextLine());

		System.out.printf("Resulf of %d/%d is %d", a, b, a / b);

	}

}