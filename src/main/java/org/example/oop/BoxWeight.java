package org.example.oop;

public class BoxWeight extends Box{

    private double pesha;

    public BoxWeight() {
    }

    public BoxWeight(double height, double depth, double width, double pesha) {
        super(height, depth, width);
        this.pesha = pesha;
    }

    @Override
    public double volume(){
        System.out.println("Po llogaris vellimin brenda BoxWeight!");
        return getHeight() * getWidth() * getDepth();
    }

    @Override
    public double volume(double height,double width,double depth){
        System.out.println("Po llogaris vellimin brenda BoxWeight!");
       return super.volume( height, width, depth);
    }

    public double shipmentFee(){
        return volume() * pesha * 0.15;
    }

    public double shipmentFee(double height,double width,double depth){
        return volume(height, width, depth) * pesha * 0.15;
    }

    public double getPesha() {
        return pesha;
    }

    public void setPesha(double pesha) {
        this.pesha = pesha;
    }
}
