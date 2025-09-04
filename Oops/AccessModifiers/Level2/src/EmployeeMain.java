public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "IT", 50000.0);
        emp1.displayEmployeeDetails();
        emp1.setSalary(55000.0);
        emp1.displayEmployeeDetails();

        System.out.println();

        Manager mgr1 = new Manager(201, "HR", 80000.0, 10);
        mgr1.displayEmployeeDetails();
        mgr1.displayManagerDetails();
        mgr1.setSalary(90000.0);
        mgr1.displayEmployeeDetails();
    }
}
