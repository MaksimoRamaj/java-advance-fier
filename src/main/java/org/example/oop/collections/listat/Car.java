package org.example.oop.collections.listat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Comparable<Car>{
    private int yearOfProduction;
    private String brand;
//Comparable percakton rendin natyror
//Comaparator percakton rendin per nje here brenda metodes Collection.sort
    @Override
    public int compareTo(Car other) {
        if (this.brand.toLowerCase().charAt(0) - other.brand.toLowerCase().charAt(0) == 0){
            return this.brand.toLowerCase().charAt(1) - other.brand.toLowerCase().charAt(1);
        }
        return this.brand.toLowerCase().charAt(0) - other.brand.toLowerCase().charAt(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && Objects.equals(brand, car.brand);
    }

    //kujdes tek gjenerimi i hashcodit

//    @Override
//    public int hashCode() {
//        return Objects.hash(yearOfProduction, brand);
//    }


    @Override
    public String toString() {
        return "Car{" +
                "yearOfProduction=" + yearOfProduction +
                ", brand='" + brand + '\'' +
                '}';
    }
}
