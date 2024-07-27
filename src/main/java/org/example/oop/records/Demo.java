package org.example.oop.records;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee("AA15","Maksi","Ramaj",22);

        String employeeId = employee.id();

        System.out.println("Id e punonjesit: " + employeeId);
    }
}
