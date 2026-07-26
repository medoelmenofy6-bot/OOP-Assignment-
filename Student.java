public class Student extends Person {

    private Course course;
    private double gpa;

    // Constructor
    public Student(String id, String name, int age, Course course, double gpa) {
        super(id, name, age);
        this.course = course;
        this.gpa = gpa;
    }

    // Getters
    public Course getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters
    public void setCourse(Course course) {
        this.course = course;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("\n===== Student Information =====");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("GPA: " + gpa);
    }
}
