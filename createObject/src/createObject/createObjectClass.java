package createObject;
import java.util.*;
class Puppy{
	
	int puppyAge;
	//constructor has one parameter name
	public Puppy(String name){
		System.out.println("Name chosen is:  "+name);
	}
	
	//create object of puppy class
	public void setAge(int age) {
		puppyAge = age;
	}
	
	public int getAge(){
		System.out.println("Poppy's age: "+puppyAge);
		return puppyAge;
	}
	
}



public class createObjectClass {

	public static void main(String[] args) {
		
		try(Scanner Input = new Scanner(System.in)){
		System.out.print("Emter your name: ");
		String name = Input.next();
		System.out.print("Emter your Age: ");
		int age = Input.nextInt();
	//create new object
		Puppy myPuppy = new Puppy(name);
	// call class method to set puppy's age
		myPuppy.setAge(age);
    // call another method to set puppy's age
		myPuppy.getAge();
	//  You can access instance variable as follow as well
	    System.out.println("Variable value: " +myPuppy.puppyAge);
	   }
	}

}
