# Day 13 – Non-Static Variables, Constructors, and Non-Static Methods

## Objective
To understand the concept of non-static variables, constructors, and non-static methods in Java and how they are used with objects.

---

# Non-Static Variable

A non-static variable is also known as an instance variable. It belongs to an object of a class rather than the class itself.

Each object of the class has its own copy of non-static variables.

Example:

class Student {
    String name;
    int age;
}

Here, name and age are non-static variables.

These variables can only be accessed through an object of the class.

---

# Constructor

A constructor is a special method used to initialize objects when they are created.

Key characteristics of constructors:

- The constructor name must be the same as the class name.
- It does not have a return type.
- It is automatically called when an object is created.

Example:

class Student {

    String name;

    Student() {
        name = "Default Name";
    }

}

The constructor is executed when an object is created using the new keyword.

---

# Non-Static Method

A non-static method is a method that belongs to an object of a class.

It can access both non-static variables and other non-static methods of the same class.

Example:

void display() {
    System.out.println(name);
}

Non-static methods must be called using an object.

Example:

Student s1 = new Student();
s1.display();

---

# Advantages

Non-static members allow objects to maintain their own state and behavior.

They help represent real-world entities more accurately in object-oriented programming.

---

# Outcome

- Learned about non-static (instance) variables.
- Understood how constructors initialize objects.
- Practiced creating and calling non-static methods using objects.
