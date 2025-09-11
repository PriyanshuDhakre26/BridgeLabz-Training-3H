// Problem 3: Hospital, Doctors, and Patients (Association and Communication)

import java.util.*;

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors in Hospital:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
        System.out.println("Patients in Hospital:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }

    // Inner Doctor class
    class Doctor {
        private String name;
        private List<Patient> patientList;

        public Doctor(String name) {
            this.name = name;
            this.patientList = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void consult(Patient patient) {
            System.out.println("Doctor " + name + " is consulting patient " + patient.getName());
            patient.addDoctor(this);   // maintain association on patient side
            if (!patientList.contains(patient)) {
                patientList.add(patient);
            }
        }

        public void showPatients() {
            System.out.println("Doctor " + name + " has consulted:");
            for (Patient p : patientList) {
                System.out.println("- " + p.getName());
            }
        }
    }

    // Inner Patient class
    class Patient {
        private String name;
        private List<Doctor> doctorList;

        public Patient(String name) {
            this.name = name;
            this.doctorList = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addDoctor(Doctor doctor) {
            if (!doctorList.contains(doctor)) {
                doctorList.add(doctor);
            }
        }

        public void showDoctors() {
            System.out.println("Patient " + name + " has consulted:");
            for (Doctor d : doctorList) {
                System.out.println("- " + d.getName());
            }
        }
    }
}

// Test the program
public class HospitalModel {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Hospital.Doctor doc1 = hospital.new Doctor("Dr. Sharma");
        Hospital.Doctor doc2 = hospital.new Doctor("Dr. Verma");

        Hospital.Patient pat1 = hospital.new Patient("Amit");
        Hospital.Patient pat2 = hospital.new Patient("Priya");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        // Consultations (association + communication)
        doc1.consult(pat1);
        doc1.consult(pat2);
        doc2.consult(pat1);

        System.out.println("\n--- Hospital Details ---");
        hospital.showDetails();

        System.out.println("\n--- Doctor Details ---");
        doc1.showPatients();
        doc2.showPatients();

        System.out.println("\n--- Patient Details ---");
        pat1.showDoctors();
        pat2.showDoctors();
    }
}
