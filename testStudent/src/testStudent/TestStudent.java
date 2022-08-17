package testStudent;

public class TestStudent {
	public static void main(String[] args) {

//		Student stu = new Hikaru();
//		StudentDesciptor.displayCharacteristics(stu);
		Student stu1 = new Phanit();
		StudentDesciptor.displayCharacteristics(stu1);

	}

}
//class Hikaru extends Student {
//
//	public Hikaru() {
//		super("e20181205");
//
//	}
//	public void describe() {
//		System.out.printf("My name is Hikaru. My id is %s. I have short black hair.\n", name, id);
//
//	}
//
//}

class Phanit extends Student {
	
	public Phanit() {
		super("e20181125");
		super.name = "Phanit";
	}
	public void describe() {
		System.out.printf("My name is %s. My id is %s. I have short black hair.\n", name, id);

	}
		
}


