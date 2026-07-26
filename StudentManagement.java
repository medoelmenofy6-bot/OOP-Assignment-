import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Person> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Student ID: ");
                    String id = input.nextLine();

                    System.out.print("Student Name: ");
                    String name = input.nextLine();

                    System.out.print("Age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    System.out.print("Course Code: ");
                    String code = input.nextLine();

                    System.out.print("Course Name: ");
                    String courseName = input.nextLine();

                    System.out.print("GPA: ");
                    double gpa = input.nextDouble();
                    input.nextLine();

                    Course course = new Course(code, courseName);

                    // Polymorphism
                    Person student = new Student(id, name, age, course, gpa);

                    students.add(student);

                    System.out.println("\nStudent Added Successfully!");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("\nNo students found.");
                    } else {

                        for (Person s : students) {
                            s.displayInfo();
                        }

                    }

                    break;

                case 3:
