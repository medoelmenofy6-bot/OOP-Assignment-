import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Person> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Count Students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Student ID: ");
                    String id = input.nextLine();

                    boolean exists = false;

                    for (Person s : students) {
                        if (s.getId().equals(id)) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Student ID already exists!");
                        break;
                    }

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

                    Person student = new Student(id, name, age, course, gpa);

                    students.add(student);

                    System.out.println("\nStudent added successfully.");
                    break;

                case 2:

                    if (students.isEmpty()) {

                        System.out.println("No students found.");

                    } else {

                        System.out.println("\n===== Student List =====");

                        for (Person s : students) {

                            s.displayInfo();
                            System.out.println("--------------------------------");

                        }

                    }

                    break;

                case 3:

                    if (students.isEmpty()) {

                        System.out.println("No students found.");
                        break;

                    }

                    System.out.print("Enter Student ID: ");
                    String searchId = input.nextLine();

                    boolean found = false;

                    for (Person s : students) {

                        if (s.getId().equals(searchId)) {

                            s.displayInfo();
                            found = true;
                            break;

                        }

                    }

                    if (!found) {

                        System.out.println("Student not found.");

                    }

                    break;
                                    case 4:

                    if (students.isEmpty()) {

                        System.out.println("No students found.");
                        break;

                    }

                    System.out.print("Enter Student ID to Update: ");
                    String updateId = input.nextLine();

                    boolean updated = false;

                    for (Person p : students) {

                        if (p.getId().equals(updateId)) {

                            Student st = (Student) p;

                            System.out.print("New Name: ");
                            st.setName(input.nextLine());

                            System.out.print("New Age: ");
                            st.setAge(input.nextInt());
                            input.nextLine();

                            System.out.print("New Course Code: ");
                            String newCode = input.nextLine();

                            System.out.print("New Course Name: ");
                            String newCourse = input.nextLine();

                            st.setCourse(new Course(newCode, newCourse));

                            System.out.print("New GPA: ");
                            st.setGpa(input.nextDouble());
                            input.nextLine();

                            System.out.println("Student updated successfully.");

                            updated = true;
                            break;

                        }

                    }

                    if (!updated) {

                        System.out.println("Student not found.");

                    }

                    break;

                case 5:

                    if (students.isEmpty()) {

                        System.out.println("No students found.");
                        break;

                    }

                    System.out.print("Enter Student ID to Delete: ");
                    String deleteId = input.nextLine();

                    boolean deleted = false;

                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).getId().equals(deleteId)) {

                            students.remove(i);
                            deleted = true;

                            System.out.println("Student deleted successfully.");

                            break;

                        }

                    }

                    if (!deleted) {

                        System.out.println("Student not found.");

                    }

                    break;

                case 6:

                    System.out.println("Total Students = " + students.size());

                    break;

                case 7:

                    System.out.println("======================================");
                    System.out.println(" Thank you for using the system.");
                    System.out.println("======================================");

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");

            }

        } while (choice != 7);

        input.close();

    }

}