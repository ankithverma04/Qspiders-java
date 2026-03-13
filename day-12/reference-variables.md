# Day 12 – Reference Variables and Object Comparison in Java

## Objective
To understand non-primitive variables (reference variables) and how object references can be compared using the equality operator in Java.

---

# Primitive and Non-Primitive Variables

In Java, variables are mainly divided into two types:

1. Primitive Variables
2. Non-Primitive Variables (Reference Variables)

Primitive variables store actual values directly in memory.

Examples:
int, float, char, boolean, double

Non-primitive variables store the reference (memory address) of an object rather than the actual data.

Examples:
Objects, Arrays, Strings, Classes.

---

# Reference Variable

A reference variable is a variable that refers to the memory location of an object.

It does not store the object itself but stores the address where the object is located in memory.

Example:

Student s1 = new Student();

Here:
- Student is the class
- s1 is the reference variable
- new Student() creates the object

---

# Memory Representation

When an object is created:

1. Memory is allocated in the heap.
2. The reference variable stores the memory address of that object.

Example:

Student s1 = new Student();
Student s2 = s1;

Here both s1 and s2 refer to the same object.

---

# Comparing Object References

Objects in Java can be compared using the equality operator (==).

The equality operator does not compare the contents of objects. Instead, it compares the memory references.

If both reference variables point to the same object, the result is true. Otherwise, it returns false.

Example:

if(s1 == s2)
    System.out.println("Both references point to the same object");

---

# Important Note

The equality operator compares references, not object data.

To compare actual object data, methods like equals() are typically used.

---

# Outcome

- Learned the concept of non-primitive (reference) variables.
- Understood how reference variables store memory addresses of objects.
- Practiced comparing object references using the equality operator.
