# Day 10 – Advanced Method Concepts in Java

## Objective
To understand advanced concepts of methods such as method return values, methods as class members, built-in methods, dynamic input reading, and method overloading.

---

# Method Return

A method can return a value to the calling method. This allows the program to use the result of a computation performed inside the method.

The return statement is used to send a value back to the method caller.

Syntax:

returnType methodName(parameters) {
    return value;
}

Example:

int add(int a, int b) {
    return a + b;
}

Here the method returns the result of addition.

---

# Method as a Member of a Class

In Java, methods are defined inside a class and are considered members of that class. Along with variables, constructors, and blocks, methods form the structure of a class.

These methods define the behavior of the class.

Example:

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

}

Here the method add() is a member of the class Calculator.

---

# Built-in Methods

Java provides many predefined methods through its standard library. These methods are called built-in methods.

Examples include:

- Math.sqrt()
- Math.max()
- Math.min()
- String.length()

These methods allow programmers to perform complex tasks without writing their own logic.

Example:

Math.sqrt(25)

This returns the square root of 25.

---

# Dynamic Read

Dynamic reading means taking input from the user during program execution. In Java, this is commonly done using the Scanner class.

Example:

Scanner sc = new Scanner(System.in);
int number = sc.nextInt();

Dynamic input makes programs interactive and flexible.

---

# Method Overloading

Method overloading means defining multiple methods with the same name but different parameter lists within the same class.

This allows the same method name to perform different operations based on the arguments passed.

Example:

int add(int a, int b)

int add(int a, int b, int c)

Both methods have the same name but different parameters.

---

# Outcome

- Learned how methods return values to the caller.
- Understood that methods are members of a class.
- Practiced using built-in methods provided by Java.
- Learned how to read dynamic input using Scanner.
- Implemented method overloading to perform multiple operations.
