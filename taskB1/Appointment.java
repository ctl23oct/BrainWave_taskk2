package taskB1;

public class Appointment {
    String patientId, doctorId, date;

    public Appointment(String patientId, String doctorId, String date) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
    }

    public void displayAppointment() {
        System.out.println("Patient ID: " + patientId + ", Doctor ID: " + doctorId + ", Date: " + date);
    }
}