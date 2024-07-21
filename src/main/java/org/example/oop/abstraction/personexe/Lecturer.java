package org.example.oop.abstraction.personexe;

public class Lecturer extends Person {

    private String specialization;
    private double salary;

    public Lecturer () {
    }

    public Lecturer(String name, String address, String specialization, double salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    @Override  //Ne kete rast duhet bere me showDetails sepse e ka kerkesa
    public String showDetails () {
        return "Lecturer{" + super.toString() +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override  //Qe tani dhe ne vazhdim do perdoret toString
    public String toString() {
        return "Lecturer{" + super.toString() +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
