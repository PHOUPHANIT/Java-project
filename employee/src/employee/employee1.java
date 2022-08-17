package employee;

public class employee1 {
	
	String name;
	int age;
	double salary;
	String designation;
	
	public employee1(String Name, int Age, double Salary, String Designation) {
		this.name = Name;
	    this.age = Age;
	    this.salary = Salary;
	    this.designation = Designation;
		
	
	}
	
	
	public void printEmployee() {
		System.out.println("Name of employee is : "+ name);
		System.out.println("\nEge is: "+ age);
		System.out.println("\nSalary is: "+ salary);
		System.out.println("\nDesignation is: "+ designation);
		
		}



	public static void main(String[] args) {
		
		employee1 e = new employee1("Phanit",12,200.12,"Software Engineering!");
		 e.printEmployee();

	}

}
