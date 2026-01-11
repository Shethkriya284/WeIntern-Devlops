
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Course: " + course;
    }
}

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = getIntInput();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: 
                    System.out.println("Exiting... Goodbye!");
                    return;
                default: 
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = getIntInput();
        
        // Check for duplicate ID
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Error: Student with this ID already exists.");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = getIntInput();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        students.add(new Student(id, name, age, course));
        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            System.out.println("\n--- Student List ---");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = getIntInput();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Current details: " + s);
                
                System.out.print("Enter New Name (Press Enter to keep current): ");
                String name = scanner.nextLine();
                if (!name.isEmpty()) s.setName(name);

                System.out.print("Enter New Age (0 to keep current): ");
                String ageStr = scanner.nextLine();
                if (!ageStr.isEmpty()) {
                    try {
                        int age = Integer.parseInt(ageStr);
                        if(age != 0) s.setAge(age);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid age format. Age not updated.");
                    }
                }

                System.out.print("Enter New Course (Press Enter to keep current): ");
                String course = scanner.nextLine();
                if (!course.isEmpty()) s.setCourse(course);

                System.out.println("Student details updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = getIntInput();

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getId() == id) {
                iterator.remove();
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Helper method to handle integer input and consume newline
    private static int getIntInput() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }
}
