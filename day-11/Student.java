class Student {

    String name;
    int age;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

}

public class ClassObjectExample {

    public static void main(String[] args) {

        // Object Creation (Instantiation)
        Student s1 = new Student();

        // Assigning values
        s1.name = "Ankit";
        s1.age = 21;

        // Calling method using object
        s1.displayDetails();

    }

}
