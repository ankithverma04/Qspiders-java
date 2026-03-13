# Day 3 – Switch Case, Decision Statement Programs and For Loop in Java

## Objective
To understand the working of the switch-case statement and the for loop in Java, and to implement programs using decision-making constructs.

---

## Theory

Control flow statements help in controlling the execution of a program. They allow a program to make decisions and repeat certain operations multiple times.

During this session, we studied the following concepts:

- Switch-case statement
- Programs using decision statements
- For loop

---

## 1. Switch Case Statement

The **switch-case statement** is used when a variable needs to be compared with multiple possible values. It is an alternative to using multiple if-else statements.

### Syntax

```

switch(expression)
{
case value1:
// code block
break;

case value2:
    // code block
    break;

case value3:
    // code block
    break;

default:
    // default code
}

```

### Explanation

- The expression is evaluated once.
- Its value is compared with each case.
- If a matching case is found, that block executes.
- The `break` statement prevents execution from continuing to the next case.
- The `default` case executes when none of the cases match.

Switch statements are commonly used in **menu-driven programs** and **option selection systems**.

---

## 2. Programs on Decision Statements

Decision statements are used to control the flow of a program depending on certain conditions.

Examples include:

- Checking whether a number is **positive or negative**
- Determining whether a number is **even or odd**
- Finding the **largest among three numbers**
- Determining **student grades**

These programs help demonstrate how logical conditions guide program behavior.

---

## 3. For Loop

The **for loop** is used to execute a block of code repeatedly for a specific number of times.

### Syntax

```

for(initialization; condition; increment/decrement)
{
// code block
}

```

### Components of For Loop

1. **Initialization** – initializes the loop variable.
2. **Condition** – checks whether the loop should continue.
3. **Increment/Decrement** – updates the loop variable.

The loop continues until the condition becomes false.

For loops are commonly used in:

- Printing sequences
- Iterating through arrays
- Counting operations
- Processing collections of data

---

## Real World Use Case

Switch-case and loops are widely used in real-world applications such as:

* **ATM machines** where users choose options like withdraw, deposit, or balance check.
* **Menu-driven systems** in applications.
* **Processing lists of users or records** in databases.
* **Generating reports** where repeated calculations are required.

The switch statement simplifies option-based selection, while loops handle repetitive tasks efficiently.

---


