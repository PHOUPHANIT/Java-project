package testStudent;

/** Must not modify this file */
public class Student {
    String id;
    String name = "Unknown";

    public Student(String id) {
        this.id = id;
    }

    public void describe() {
        System.out.printf("My name is %s. \nMy Id is %s. \nI am thin and have long curly hair.\n", name, id);
    }
}