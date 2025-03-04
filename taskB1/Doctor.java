package taskB1;

public class Doctor {
    String id, name, specialization;

    public Doctor(String id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public void displayDoctor() {
        System.out.println("ID: " + id + ", Name: " + name + ", Specialization: " + specialization);
    }
}