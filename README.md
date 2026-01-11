Java Developer Intern - Week 1 Tasks
=====================================
Submitted by: [Your Name/Intern ID]
Date: [Current Date]

Overview
--------
This submission contains the implementation of three Core Java tasks as assigned for Week 1 of the internship.
The tasks demonstrate understanding of OOP concepts, Java Collection Framework (ArrayList), Modular Programming, and File I/O.

Directory Structure
-------------------
The project files are organized as follows:

/JavaTasks
  |-- StudentManagementSystem.java  (Task 1: Console-based CRUD App)
  |-- NumberUtility.java            (Task 2: Modular Math Operations)
  |-- FileHandlingApp.java          (Task 3: File I/O Operations)
  |-- input.txt                     (Input file for Task 3)
  |-- output.txt                    (Generated output from Task 3)
  |-- Presentation_Slides.md        (Presentation content)
  |-- README.txt                    (This file)

How to Run
----------

1. Student Management System
   - Description: Manages student records (Add, View, Update, Delete).
   - Compile: javac StudentManagementSystem.java
   - Run:     java StudentManagementSystem

2. Number Utility Program
   - Description: Performs Prime check, Palindrome check, Factorial, and Fibonacci series.
   - Compile: javac NumberUtility.java
   - Run:     java NumberUtility

3. File Handling Application
   - Description: Reads 'input.txt', counts lines/words/chars, and saves stats to 'output.txt'.
   - Compile: javac FileHandlingApp.java
   - Run:     java FileHandlingApp

Dependencies
------------
- Java Development Kit (JDK) 8 or higher.
- Standard Java libraries (java.util, java.io).

Notes for Evaluator
-------------------
- The Student Management System uses an ArrayList to store data in memory. Data is lost when the program terminates.
- Input validation handles non-integer inputs to prevent crashes.
- The File Handling App ensures resources are closed using try-with-resources.

Thank you for your review.
