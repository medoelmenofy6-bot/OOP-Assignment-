# 🎓 Student Management System

A simple Java console-based application developed using **Object-Oriented Programming (OOP)** concepts. This project allows users to manage student records through a menu-driven interface.

---

## 📌 Project Overview

The Student Management System is designed to demonstrate the core principles of Java Object-Oriented Programming. It enables users to add, display, search, update, delete, and count student records in an easy-to-use console application.

---

## ✨ Features

- ➕ Add Student
- 📋 Display All Students
- 🔍 Search Student by ID
- ✏️ Update Student Information
- ❌ Delete Student
- 📊 Count Total Students
- ✅ Prevent Duplicate Student IDs

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- Scanner
- Git
- GitHub

---

## 📂 Project Structure

```
StudentManagementSystem/
│
├── Person.java
├── Student.java
├── Course.java
├── StudentManagement.java
├── README.md
└── Report.pdf
```

---

## 🧩 OOP Concepts Implemented

### Encapsulation
Private attributes are accessed using getter and setter methods.

### Inheritance
`Student` inherits from the abstract `Person` class.

### Abstraction
`Person` is implemented as an abstract class.

### Polymorphism
A `Person` reference points to a `Student` object.

Example:

```java
Person student = new Student(id, name, age, course, gpa);
```

---

## 📋 Program Menu

```
========== Student Management System ==========
1. Add Student
2. Display All Students
3. Search Student
4. Update Student
5. Delete Student
6. Count Students
7. Exit
```

---

## 🚀 How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java StudentManagement
```

---

## 📸 Sample Output

```
========== Student Management System ==========
1. Add Student
2. Display All Students
3. Search Student
4. Update Student
5. Delete Student
6. Count Students
7. Exit

Enter your choice:
```

---

## 📖 UML Diagram

The project includes a professional UML Class Diagram illustrating:

- Person (Abstract Class)
- Student
- Course
- StudentManagement

Relationships:

- Inheritance
- Association
- Dependency

---

## 📈 Future Improvements

- File Storage
- Database Integration
- GUI using JavaFX
- Login System
- Multiple Courses per Student

---

## 👨‍💻 Author

**Name:** *Elmenoufy*

Faculty of Information Technology

City University Malaysia

---

## 📄 License

This project was developed for educational purposes only.

---

⭐ If you found this project useful, consider giving it a star!
