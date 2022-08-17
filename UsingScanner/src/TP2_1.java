import java.util.*;

public class TP2_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String name;

		System.out.print("Input your name: ");
		name = input.nextLine();

		System.out.print("Hello," + name + "!");
		input.close();
	}

}
