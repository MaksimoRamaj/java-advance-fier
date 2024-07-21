package org.example.oop.composition;

public class AirConditioner {
    private String brand;
    private String grada;
    private int vitProdhimi;

    public AirConditioner(String brand, String grada, int vitProdhimi) {
        this.brand = brand;
        this.grada = grada;
        this.vitProdhimi = vitProdhimi;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGrada() {
        return grada;
    }

    public void setGrada(String grada) {
        this.grada = grada;
    }

    public int getVitProdhimi() {
        return vitProdhimi;
    }

    public void setVitProdhimi(int vitProdhimi) {
        this.vitProdhimi = vitProdhimi;
    }
}
