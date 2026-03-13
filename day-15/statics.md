# Day 15 – Static Variable, Static Method, and Static Initializers

## Objective
To understand static members in Java including static variables, static methods, and static initializer blocks.

---

# Static Variable

A static variable is a variable that belongs to the class rather than to individual objects. It is shared among all instances of the class.

Static variables are created only once in memory and all objects access the same copy.

Syntax:

static dataType variableName;

Example:

class Student {
    static String college = "ABC College";
}

Here, the variable college is shared among all objects of the Student class.

---

# Static Method

A static method belongs to the class rather than an object. It can be called without creating an object of the class.

Static methods can access only static variables and static methods directly.

Syntax:

static void methodName() {
    // code
}

Example:

class Demo {

    static void display() {
        System.out.println("Static Method Example");
    }

}

The static method can be called using the class name.

Example:

Demo.display();

---

# Static Initializer

A static initializer block is used to initialize static variables. It is executed only once when the class is loaded into memory.

Syntax:

static {
    // initialization code
}

Example:

class Example {

    static {
        System.out.println("Static initializer executed");
    }

}

This block runs before the main method when the class is loaded.

---

# Advantages of Static Members

Static members provide several benefits:

- Shared memory for common data
- No need to create objects to access methods
- Useful for utility functions
- Efficient memory usage

---

# Outcome

- Learned about static variables and how they are shared among objects.
- Understood static methods and how they are called using the class name.
- Practiced using static initializer blocks to initialize static data.
