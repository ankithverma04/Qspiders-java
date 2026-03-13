# Day 11 – Class and Object in Java

## Objective
To understand the basic concepts of Object-Oriented Programming including class, object, and object creation (instantiation).

---

# Introduction to Object-Oriented Programming

Object-Oriented Programming (OOP) is a programming paradigm that organizes software design around objects rather than functions. Objects represent real-world entities and contain both data and behavior.

Java is a fully object-oriented programming language that uses classes and objects to build programs.

---

# Class

A class is a blueprint or template used to create objects. It defines the properties (variables) and behaviors (methods) that the objects created from the class will have.

In simple terms, a class describes what an object will contain and what it can do.

Example:

class Student {

    String name;
    int age;

}

Here, Student is a class that contains two variables.

---

# Object

An object is an instance of a class. It represents a real-world entity and contains the values defined by the class.

Objects allow access to the variables and methods defined in a class.

Example:

Student s1;

Here s1 is an object reference.

---

# Object Creation (Instantiation)

Object creation is the process of creating an instance of a class using the new keyword.

Syntax:

ClassName objectName = new ClassName();

Example:

Student s1 = new Student();

This creates a new object of the Student class.

---

# Accessing Class Members

Once an object is created, we can access the variables and methods of the class using the dot (.) operator.

Example:

s1.name = "Ankit";
s1.age = 21;

System.out.println(s1.name);

---

# Importance of Classes and Objects

Classes and objects help in:

- Organizing code into reusable structures
- Representing real-world entities
- Improving code maintainability
- Implementing Object-Oriented Programming principles

---

# Outcome

- Learned the concept of classes in Java.
- Understood what objects are and how they represent instances of a class.
- Practiced creating objects using the new keyword.
- Accessed class variables using objects.
