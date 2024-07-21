package org.example.oop.composition;

public class Bedroom {
    //Composition -> Klasa perbehet nga reference(datatype) te klasave te tjera
    private Bed bed;
    private Tv tv;
    private AirConditioner airConditioner;

    public Bedroom() {
    }

    public Bedroom(Bed bed, Tv tv, AirConditioner airConditioner) {
        this.bed = bed;
        this.tv = tv;
        this.airConditioner = airConditioner;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
}
