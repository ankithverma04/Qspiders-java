# Day 2 – Unary, Ternary Operators and Decision Statements in Java

## Objective
To understand the working of unary and ternary operators in Java and learn how decision-making statements such as if, if-else, and if-else ladder help control the flow of a program.

---

## Theory

Java provides various operators and control statements that help programmers perform operations and make decisions during program execution.

In this session, the following concepts were covered:

---

## 1. Unary Operators

Unary operators operate on **only one operand**. They are mainly used for incrementing, decrementing, or changing the sign of a value.

### Types of Unary Operators

| Operator | Description |
|--------|-------------|
| + | Unary plus |
| - | Unary minus |
| ++ | Increment operator |
| -- | Decrement operator |
| ! | Logical NOT |

### Increment and Decrement

Increment and decrement operators have two forms:

**Pre-Increment**

++a

Value is incremented first and then used.

**Post-Increment**

a++

Value is used first and then incremented.

These operators are commonly used in **loops and counters**.

---

## 2. Ternary Operator

The ternary operator is a **short-hand form of the if-else statement**. It evaluates a condition and returns one of two values depending on whether the condition is true or false.

### Syntax


condition ? expression1 : expression2


- If the condition is **true**, expression1 executes.
- If the condition is **false**, expression2 executes.

The ternary operator helps make code **shorter and more readable**.

---

## 3. Decision Statements

Decision-making statements control the **flow of execution** in a program based on conditions.

Java provides several decision statements, including:

- if statement
- if-else statement
- if-else ladder

---

### 3.1 If Statement

The **if statement** executes a block of code only if a specified condition is true.

### Syntax


if(condition)
{
// code block
}


If the condition evaluates to true, the block of code inside the if statement executes.

---

### 3.2 If-Else Statement

The **if-else statement** provides two execution paths depending on the condition.

### Syntax


if(condition)
{
// code if condition is true
}
else
{
// code if condition is false
}


This statement is used when there are **two possible outcomes**.

---

### 3.3 If-Else Ladder

An **if-else ladder** is used when multiple conditions need to be checked sequentially.

### Syntax

```java
if(condition1)
{
// code
}
else if(condition2)
{
// code
}
else if(condition3)
{
// code
}
else
{
// default code
}

```
It helps in selecting one block of code among many alternatives.

---

## Java Program (Implementation)

```java
public class DecisionDemo {

    public static void main(String[] args) {

        int a = 10;

        // Unary Operators
        System.out.println("Original value: " + a);

        System.out.println("Post Increment: " + (a++));
        System.out.println("After Post Increment: " + a);

        System.out.println("Pre Increment: " + (++a));

        System.out.println("Pre Decrement: " + (--a));

        // Ternary Operator
        int number = 20;
        String result = (number % 2 == 0) ? "Even Number" : "Odd Number";

        System.out.println("Ternary Result: " + result);

        // If Statement
        if(number > 10) {
            System.out.println("Number is greater than 10");
        }

        // If-Else Statement
        int age = 17;

        if(age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        // If-Else Ladder
        int marks = 85;

        if(marks >= 90) {
            System.out.println("Grade A");
        }
        else if(marks >= 75) {
            System.out.println("Grade B");
        }
        else if(marks >= 50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }
    }
}
