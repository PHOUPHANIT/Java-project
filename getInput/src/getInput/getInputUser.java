package getInput;

import java.util.Scanner;

public class getInputUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int id;
		String name;
		String sex;
		double salary;
		
		//input
		System.out.print("Enter your ID: ");         id = input.nextInt();
		                                             input.nextLine(); //used to catch input name statement
		System.out.print("Enter your Lastname: ");   name = input.nextLine(); 
		System.out.print("Enter your sex: ");        sex = input.nextLine();
		System.out.print("Enter your salary: ");     salary = input.nextDouble();
		
		//output
		System.out.println("\nID\t\tName\t\tSex\t\tSalary");
		System.out.println(id+"\t\t"+name+"\t\t"+sex+"\t\t"+salary+" $");

	}

}
