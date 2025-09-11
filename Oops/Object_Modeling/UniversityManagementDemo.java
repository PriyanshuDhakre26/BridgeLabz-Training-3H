import java.util.ArrayList;

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public void showEnrolledCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("  - " + c.getCourseName());
        }
    }
}

class Professor {
    private String name;
    private ArrayList<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.setProfessor(this);
        System.out.println("Professor " + name + " assigned to " + course.getCourseName());
    }

    public void showCoursesTaught() {
        System.out.println("Professor: " + name + " teaches:");
        for (Course c : courses) {
            System.out.println("  - " + c.getCourseName());
        }
    }
}

class Course {
    private String courseName;
    private ArrayList<Student> students;
    private Professor professor;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("  Professor: " + professor.getName());
        } else {
            System.out.println("  No professor assigned.");
        }
        System.out.println("  Enrolled Students:");
        for (Student s : students) {
            System.out.println("   - " + s.getName());
        }
    }
}

public class UniversityManagementDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. Johnson");

        Course c1 = new Course("Computer Science");
        Course c2 = new Course("Mathematics");

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s3.enrollCourse(c2);

        p1.assignCourse(c1);
        p2.assignCourse(c2);

        System.out.println("\n=== University Records ===");
        c1.showCourseDetails();
        c2.showCourseDetails();

        System.out.println();
        s1.showEnrolledCourses();
        p1.showCoursesTaught();
    }
}
