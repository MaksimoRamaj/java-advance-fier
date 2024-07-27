package org.example.oop.records;

public record Employee(String id,String emri,String mbiemri,int mosha) {

    public Employee(String id, String emri, String mbiemri, int mosha) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        if (mosha < 0){
            this.mosha = 0;
        }else {
            this.mosha = mosha;
        }
    }
}
