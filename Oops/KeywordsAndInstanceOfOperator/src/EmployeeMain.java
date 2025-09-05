public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Priyanshu", 1, "Software Engineer");
        Employee emp2 = new Employee("Ravi", 2, "Data Analyst");
        Employee emp3 = new Employee("Sneha", 3, "HR Manager");

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

        Employee.displayTotalEmployees();
    }
}
