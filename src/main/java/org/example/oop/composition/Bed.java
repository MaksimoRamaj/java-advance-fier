package org.example.oop.composition;

import java.util.Objects;

public class Bed {
   private String materiali;
   private int size;
   private int nrJastek;

    public Bed(String materiali, int size, int nrJastek) {
        this.materiali = materiali;
        this.size = size;
        this.nrJastek = nrJastek;
    }

    public String getMateriali() {
        return materiali;
    }

    public void setMateriali(String materiali) {
        this.materiali = materiali;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNrJastek() {
        return nrJastek;
    }

    public void setNrJastek(int nrJastek) {
        this.nrJastek = nrJastek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(materiali, size, nrJastek);
    }

    @Override
    public boolean equals(Object obj) {
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public String toString() {
        return "Bed{" +
                "materiali='" + materiali + '\'' +
                ", size=" + size +
                ", nrJastek=" + nrJastek +
                '}';
    }
}
