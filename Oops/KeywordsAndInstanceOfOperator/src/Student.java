public class Student {
    static String universityName = "Global University";
    private static int totalStudents = 0;
    private String name;
    private String grade;
    private final int rollNumber;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + this.name + " to: " + this.grade);
        }
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + this.name);
            System.out.println("Roll Number: " + this.rollNumber);
            System.out.println("Grade: " + this.grade);
        }
    }
}
