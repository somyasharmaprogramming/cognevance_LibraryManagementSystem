# cognevance_LibraryManagementSystem
Project Overview: Build a Java-based library management application to manage books and users.# 📄 Library Management System Documentation

## Project Title

**Library Management System**

---

# 1. Introduction

The Library Management System is a Java-based console application developed to manage library records efficiently. The system allows users to perform operations such as adding books, viewing book details, searching books, updating book information, and deleting books.

This project demonstrates the practical implementation of Object-Oriented Programming (OOP) concepts, Java Collections Framework, exception handling, and menu-driven programming.

---

# 2. Project Objective

The main objectives of this project are:

* To automate library record management.
* To reduce manual work in maintaining book records.
* To provide CRUD (Create, Read, Update, Delete) operations.
* To practice Core Java concepts.
* To develop problem-solving and programming skills.

---

# 3. Technologies Used

| Technology                        | Purpose                   |
| --------------------------------- | ------------------------- |
| Java                              | Core Programming Language |
| JDK 17 (or above)                 | Java Development Kit      |
| VS Code / IntelliJ IDEA / Eclipse | Code Editor / IDE         |
| Java Collections (ArrayList)      | Data Storage              |
| Scanner Class                     | User Input Handling       |
| OOP Concepts                      | Project Design            |

---

# 4. Software Requirements

### Minimum Requirements

* Operating System: Windows 10/11, Linux, or macOS
* Java JDK 17 or later
* Any Java IDE:

  * VS Code
  * IntelliJ IDEA
  * Eclipse

### Hardware Requirements

* Processor: Intel i3 or above
* RAM: 4 GB or above
* Storage: 100 MB free space

---

# 5. Setup Process

## Step 1: Install Java

Download and install JDK from:

[Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/?utm_source=chatgpt.com)

Verify installation:

```bash
java -version
javac -version
```

---

## Step 2: Install IDE

You can use:

* [Visual Studio Code](https://code.visualstudio.com/?utm_source=chatgpt.com)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/?utm_source=chatgpt.com)
* [Eclipse IDE](https://www.eclipse.org/downloads/?utm_source=chatgpt.com)

---

## Step 3: Create Java File

Create a file:

```text
LibraryManagementSystem.java
```

Copy the project source code into this file.

---

## Step 4: Compile Program

Open terminal and run:

```bash
javac LibraryManagementSystem.java
```

---

## Step 5: Execute Program

Run the program:

```bash
java LibraryManagementSystem
```

---

# 6. Project Workflow

The application follows a menu-driven workflow.

```text
Start Program
      |
      V
Display Menu
      |
      V
Select Operation
      |
      +---- Add Book
      |
      +---- View Books
      |
      +---- Search Book
      |
      +---- Update Book
      |
      +---- Delete Book
      |
      +---- Exit
      |
      V
Return to Menu
```

---

# 7. System Design

## Class Used

### Book Class

Stores:

* Book ID
* Book Name
* Author Name
* Quantity

### Library Management Class

Handles:

* Add Book
* View Book
* Search Book
* Update Book
* Delete Book

---

# 8. CRUD Operations

## Create

Adds a new book record.

```java
books.add(new Book(id, name, author, quantity));
```

---

## Read

Displays all available books.

```java
for(Book b : books)
{
    System.out.println(b);
}
```

---

## Update

Updates the quantity of a selected book.

```java
book.setQuantity(newQuantity);
```

---

## Delete

Removes a book from the library.

```java
books.remove(book);
```

---

# 9. OOP Concepts Implemented

## Encapsulation

Private variables are accessed using public methods.

```java
private int bookId;
```

---

## Class and Object

```java
Book book = new Book(...);
```

---

## Constructor

Used for object initialization.

```java
public Book(...)
{
    ...
}
```

---

## Polymorphism

Method overriding using `toString()`.

```java
@Override
public String toString()
{
    ...
}
```

---

# 10. Exception Handling

The project can be enhanced with exception handling to avoid invalid user inputs.

Example:

```java
try
{
    int choice = sc.nextInt();
}
catch(Exception e)
{
    System.out.println("Invalid Input");
}
```

Benefits:

* Prevents program crashes.
* Improves reliability.
* Enhances user experience.

---

# 11. Sample Output

```text
==============================
 LIBRARY MANAGEMENT SYSTEM
==============================
1. Add Book
2. View All Books
3. Search Book
4. Update Book Quantity
5. Delete Book
6. Exit

Enter Choice: 1

Enter Book ID: 101
Enter Book Name: Java Programming
Enter Author Name: James Gosling
Enter Quantity: 10

Book Added Successfully
```

---

# 12. Advantages

* Easy to use.
* Simple user interface.
* Fast record management.
* Demonstrates Java fundamentals.
* Suitable for academic projects.

---

# 13. Future Enhancements

The following features can be added in future versions:

* Student Management
* Book Issue and Return System
* Fine Calculation
* Login Authentication
* Database Connectivity using JDBC and MySQL
* GUI using Java Swing or JavaFX
* Search by Author Name
* Search by Book Name
* Report Generation

---

# 14. Conclusion

The Library Management System is a simple and effective Java application designed to manage library records. It successfully performs CRUD operations using Java Collections and demonstrates the use of Object-Oriented Programming concepts. This project provides a strong foundation for learning software development and can be extended into a complete library automation system using databases and graphical user interfaces. 🚀

This documentation is suitable to submit as a **project report/documentation file** along with the source code, screenshots, and GitHub repository link.

