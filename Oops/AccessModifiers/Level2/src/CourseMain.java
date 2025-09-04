public class CourseMain {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 15000.0);
        Course c2 = new Course("Web Development", 6, 30000.0);
        Course c3 = new Course("Data Science", 9, 50000.0);

        System.out.println("Before updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy");

        System.out.println("\nAfter updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();
    }
}
