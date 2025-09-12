public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee m = new Manager("Alice", 101, 90000, 10);
        Employee d = new Developer("Bob", 102, 70000, "Java");
        Employee i = new Intern("Charlie", 103, 20000, 6);

        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}
