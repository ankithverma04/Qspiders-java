# Day 4 – Looping Statements in Java

## Objective
To understand looping statements in Java such as while loop, do-while loop, and nested loops, and how they help in executing repetitive tasks efficiently.

---

# Looping Statements

Looping statements allow a program to execute a block of code repeatedly as long as a given condition is true. They help reduce code duplication and make programs more efficient.

Java provides several looping constructs, including:

- while loop
- do-while loop
- nested loop

---

# 1. While Loop

The **while loop** is used when the number of iterations is not known beforehand and depends on a condition.

## Syntax

```

while(condition)
{
// code to be executed
}

```

## Explanation

1. The condition is checked first.
2. If the condition is true, the loop body executes.
3. After execution, the condition is checked again.
4. The loop stops when the condition becomes false.

---

# 2. Do-While Loop

The **do-while loop** is similar to the while loop, but it guarantees that the loop executes **at least once**.

## Syntax

```

do
{
// code block
}
while(condition);

```

## Explanation

1. The loop body executes first.
2. Then the condition is checked.
3. If the condition is true, the loop repeats.
4. If the condition is false, the loop stops.

This loop is useful in **menu-driven applications**.

---

# 3. Nested Loop

A **nested loop** is a loop inside another loop.

## Syntax

```

for(...)
{
for(...)
{
// inner loop code
}
}

```

## Explanation

- The outer loop executes first.
- For each iteration of the outer loop, the inner loop runs completely.

Nested loops are commonly used in:

- Pattern printing
- Matrix operations
- Table generation

---

# Advantages of Loops

- Reduces code repetition
- Improves program efficiency
- Simplifies complex calculations
- Helps process large datasets

---

# Outcome

- Learned the concept of **while loop, do-while loop, and nested loops**.
- Understood how loops help in executing repetitive tasks.
- Identified situations where each loop type is used in real-world programs.
```
