package model;

import model.Circle;

public class Cylinder {
    private double height = 1.0;
    private Circle base;
    
    
    public Cylinder(){
        this.base = new Circle();
        this.base.setRadius(1.0);
    }

    public Cylinder(double height){
        this.height = height;
        this.base = new Circle();
    }

    public Cylinder(double height, double radius){
        this.height = height;
        this.base = new Circle();
        this.base.setRadius(radius);
        
        base.setRadius(radius);
    }

    public Cylinder(double height, Circle base) {
        this.height = height;
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Circle getBase() {
        return base;
    }
    public void setBase(Circle base) {
        this.base = base;
    }

    public double getVolume(){
        double volume = base.getArea() * height;
        return volume;
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + ", base=" + base + "]";
    }
}
