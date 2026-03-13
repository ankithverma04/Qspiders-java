class Student {

    // Non-static variables
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Non-static method
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

}

public class NonStaticConstructorExample {

    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student("Ankit", 21);
        Student s2 = new Student("Rahul", 22);

        // Calling non-static methods
        s1.displayDetails();
        System.out.println();

        s2.displayDetails();
    }

}
