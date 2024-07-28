package org.example.oop.generics.wildcards;

//Bounded Types

public class Stats<T extends Number> {

    T[] numbers;

    public Stats(T[] numbers) {
        this.numbers = numbers;
    }

    public T[] getNumbers() {
        return numbers;
    }

    public void setNumbers(T[] numbers) {
        this.numbers = numbers;
    }

    public double average(){
        double sum = 0.0;

        for (int i = 0 ; i < numbers.length ; i++){
            sum = sum + numbers[i].doubleValue();
        }

        return sum/numbers.length;
    }

    public boolean sameAvg(Stats<? extends Number> other){
        if (this.average() == other.average()){
            return true;
        }
        return false;
    }
}
