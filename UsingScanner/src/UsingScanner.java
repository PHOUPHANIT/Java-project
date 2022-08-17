import java.util.Scanner;

public class UsingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input integer a: ");
		int a = sc.nextInt();

		System.out.print("Input long integer b: ");
		long b = sc.nextLong();

		System.out.print("Input float c: ");
		float c = sc.nextFloat();

		System.out.print("Input double d: ");
		double d = sc.nextDouble();
		sc.nextLine();// skip \n character in input stream
		System.out.print("Input a sentence or line: ");
		String e = sc.nextLine(); // read a line (including space)

		System.out.print("Input a word: ");
		String f = sc.next(); // read until space or line break
		sc.nextLine();
		System.out.print("Input a character: ");
		char g = sc.nextLine().charAt(0); // read as String and get first character
		
		System.out.print(a+b+c+d+e+f+g);
		sc.close();
	}
}