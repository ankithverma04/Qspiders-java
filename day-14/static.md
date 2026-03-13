# Day 14 – Non-Static Initializer, Object Loading Process, and Introduction to Static

## Objective
To understand the concept of non-static initializer blocks, the object loading process in Java, and the introduction to static members.

---

# Non-Static Initializer

A non-static initializer is a block of code that is executed whenever an object of a class is created. It is written inside the class but outside any method or constructor.

It is mainly used to initialize instance variables.

Example:

class Example {

    {
        System.out.println("Non-static initializer executed");
    }

}

This block runs every time an object is created.

---

# Object Loading Process

The object loading process refers to the sequence of steps that occur when an object is created in Java.

Steps involved in object creation:

1. Memory is allocated for the object in the heap.
2. Instance variables are initialized with default values.
3. Non-static initializer blocks are executed.
4. Constructor is executed.
5. The object reference is returned to the variable.

This process ensures that the object is fully initialized before it is used.

---

# Introduction to Static

The static keyword in Java is used for variables and methods that belong to the class rather than objects.

Static members are shared among all objects of the class.

Example:

class Demo {

    static int count = 0;

}

Here, count is a static variable shared by all objects.

---

# Static Variable

A static variable is created only once in memory and shared among all objects.

Example:

static int number;

---

# Static Method

A static method belongs to the class and can be called without creating an object.

Example:

static void display() {
    System.out.println("Static Method");
}

---

# Outcome

- Learned how non-static initializer blocks work.
- Understood the object loading process in Java.
- Learned the basics of static variables and static methods.
