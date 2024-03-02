/**
* <Tugas week6>
* Author  : Nobby Dharma Khaulid
* NIM     : 231524020
* Tanggal : 29 Februari 2023
 */

 //circle class
public class Circle extends Shape{
    private double radius;

    //constructors
    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    //Getter and setter methods for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Methods to calculate area and perimeter
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getParameter(){
        return 2*Math.PI*radius;
    }

    //Override toString() method to provide a string representation of the Circle object
    @Override
    public String toString(){
        return "A Circle with radius = " + radius + ", Which is a subclass of" + super.toString();
    }
}

