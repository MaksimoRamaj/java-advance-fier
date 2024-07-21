package org.example.oop.abstraction.personexe;

public class Demostration {
    public static void main(String[] args) {

        Student student = new Student("Anna" , "Fier" ,
                "Java", 2024, 550) ;

        Lecturer lecturer = new Lecturer("Maksi" , "Tirana" ,
                "computer eng",400 ) ;

        System.out.println(student.showDetails());
        System.out.println(lecturer.showDetails());
    }

}
