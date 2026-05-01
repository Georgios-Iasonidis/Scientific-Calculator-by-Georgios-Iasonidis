
# Scientific-Calculator-by-Georgios-Iasonidis# Scientific Calculator in Java

A scientific calculator/interpreter built in **Java** with **ANTLR** and the **Visitor pattern**. The project was developed in **Eclipse** and evaluates arithmetic, logical, trigonometric, and other mathematical expressions through custom visitor methods.

## Features

- Arithmetic operations: `+`, `-`, `*`, `/`, `%`, `^`
- Trigonometric functions: `SIN`, `COS`, `TAN`, `COT`
- Mathematical functions: `LOG`, `SQRT`, `FACT`
- Logical operations: `&&`, `||`, `!`, `XOR`, `NAND`
- Constants: `P`, `E`

## Example Input

```text
5 + 3;
10 - 2;
6 * 4;
12 / 3;
2 ^ 4;
10 % 3;
TRUE && FALSE;
TRUE || FALSE;
! TRUE;
P;
E;
LOG(5);
SQRT(49);
SIN(5);
COS(5);
TAN(5);
COT(5);
5 FACT;
TRUE XOR FALSE;
TRUE NAND TRUE;
```

## Project Structure

```text
Java_erg/
├── .settings/
├── bin/
├── src/
│   ├── Hello.tokens
│   ├── HelloBaseListener.java
│   ├── HelloBaseVisitor.java
│   ├── HelloLexer.java
│   ├── HelloLexer.tokens
│   ├── HelloListener.java
│   ├── HelloParser.java
│   ├── HelloVisitor.java
│   ├── MyCompiler.java
│   └── myVisitor.java
├── target/
├── .classpath
├── .project
├── input
└── Scientific_Culculator.jar
```

## Technologies Used

- Java
- ANTLR
- Eclipse IDE
- Visitor pattern

## How to Run

### Run from Eclipse

1. Open the project in Eclipse.
2. Make sure the generated ANTLR files are included in `src`.
3. Build the project.
4. Run `MyCompiler.java`.

### Run from Command Prompt

```bash
cd C:\Users\username\eclipse-workspace\Java_erg
java -jar Scientific_Culculator.jar
```

## How It Works

ANTLR generates the lexer, parser, listener, and visitor classes, while the custom `myVisitor.java` class overrides visit methods to evaluate each supported operation and print the result.

## Notes

- Some operations support only numeric input.
- Logical operations expect `TRUE` or `FALSE`.
- Division and modulo by zero are handled with error messages.
- Unsupported string operations return appropriate messages.

## Purpose

This project was created to practice:

- Java programming
- ANTLR grammar integration
- Parse tree traversal with visitors
- Scientific calculator implementation
- Eclipse project development

## Author

Developed as an educational Java/ANTLR project in Eclipse.
