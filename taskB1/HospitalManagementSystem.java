package taskB1;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void registerPatient(String id, String name, int age, String disease) {
        patients.add(new Patient(id, name, age, disease));
        System.out.println("Patient registered successfully.");
    }

    public void addDoctor(String id, String name, String specialization) {
        doctors.add(new Doctor(id, name, specialization));
        System.out.println("Doctor added successfully.");
    }

    public void scheduleAppointment(String patientId, String doctorId, String date) {
        appointments.add(new Appointment(patientId, doctorId, date));
        System.out.println("Appointment scheduled successfully.");
    }

    public void displayPatients() {
        for (Patient p : patients) {
            p.displayPatient();
        }
    }

    public void displayDoctors() {
        for (Doctor d : doctors) {
            d.displayDoctor();
        }
    }

    public void displayAppointments() {
        for (Appointment a : appointments) {
            a.displayAppointment();
        }
    }

    public static void main(String[] args) {
        HospitalManagementSystem hms = new HospitalManagementSystem();
        hms.registerPatient("P001", "John Doe", 30, "Flu");
        hms.addDoctor("D001", "Dr. Smith", "Cardiology");
        hms.scheduleAppointment("P001", "D001", "2025-03-10");

        hms.displayPatients();
        hms.displayDoctors();
        hms.displayAppointments();
    }
}