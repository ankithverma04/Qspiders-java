# Day 9 – Introduction to Methods in Java

## Objective
To understand the concept of methods in Java, how they are created, and how they are called in a program.

---

# Introduction to Methods

A method in Java is a block of code that performs a specific task. Methods help in organizing code into smaller and reusable parts. Instead of writing the same code multiple times, a method can be created once and called whenever needed.

Methods improve program readability, maintainability, and reusability.

---

# Method Creation

Creating a method means defining a block of code that can be executed when the method is called.

The basic syntax of a method in Java is:

returnType methodName(parameters) {
    // method body
}

Components of a method include:

- Access modifier
- Return type
- Method name
- Parameters
- Method body

Example:

void displayMessage() {
    System.out.println("Welcome to Java Programming");
}

---

# Method Call

A method call is used to execute the method. When a method is called, the program control transfers to the method and executes the statements inside it.

Example:

displayMessage();

---

# No Argument Method

A no argument method is a method that does not accept any parameters.

Example:

void greet() {
    System.out.println("Hello, Welcome!");
}

Here, the method does not require any input values.

---

# Parameterized Method

A parameterized method is a method that accepts parameters (input values). These parameters allow the method to perform operations using different values.

Example:

void addNumbers(int a, int b) {
    System.out.println(a + b);
}

Here, the method takes two parameters and performs addition.

---

# Importance of Methods

Methods provide several advantages:

- Code reusability
- Better program organization
- Improved readability
- Easier debugging and maintenance

---

# Outcome

- Learned how methods are created in Java.
- Understood how to call methods in a program.
- Practiced no argument methods and parameterized methods.
