public class StudentMain {
    public static void main(String[] args) {
        Student stu1 = new Student("Priyanshu", 101, "A");
        Student stu2 = new Student("Ravi", 102, "B");

        stu1.displayDetails();
        stu2.displayDetails();

        Student.displayTotalStudents();

        stu2.updateGrade("A+");
        stu2.displayDetails();
    }
}
