public class PatientMain {
    public static void main(String[] args) {
        Patient p1 = new Patient("Priyanshu", 25, "Fever", 1001);
        Patient p2 = new Patient("Ravi", 40, "Diabetes", 1002);
        Patient p3 = new Patient("Sneha", 30, "Asthma", 1003);

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();

        Patient.getTotalPatients();
    }
}
