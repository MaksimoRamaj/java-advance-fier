package org.example.oop.abstraction.personexe;

public class Student extends Person {


    private String typeOfStudy;
    private int vitiStudimit;
    private double costOfStudy;

    public Student (){
    }

    public Student(String name, String address, String typeOfStudy, int vitiStudimit, double costOfStudy) {
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.vitiStudimit = vitiStudimit;
        this.costOfStudy = costOfStudy;
    }

    @Override
    public String showDetails() {
        return "Student" + "\n" +  "Name: " +getName() + "\nAddress: " +getAddress()
                +"\nType of study is: " +getTypeOfStudy() + "\nCost of study is: "
                +getCostOfStudy();
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getVitiStudimit() {
        return vitiStudimit;
    }

    public void setVitiStudimit(int vitiStudimit) {
        this.vitiStudimit = vitiStudimit;
    }

    public double getCostOfStudy() {
        return costOfStudy;
    }

    public void setCostOfStudy(double costOfStudy) {
        this.costOfStudy = costOfStudy;
    }


}
