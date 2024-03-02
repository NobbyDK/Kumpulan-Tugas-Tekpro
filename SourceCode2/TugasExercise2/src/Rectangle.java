/**
* <Tugas week6>
* Author  : Nobby Dharma Khaulid
* NIM     : 231524020
* Tanggal : 29 Februari 2023
 */

 // Rectangle class
public class Rectangle extends Shape {
    private double width;
    private double length;

    //Constructors
    public Rectangle(){
        width = 1.0;    //Default width is 1.0
        length = 1.0; //Default length is 1.0
    }

    public Rectangle(double width, double length){
        this.width = width; //Initialize width with the provided value
        this.length = length; //Initialize length with the provided value
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);   //Call superclass constructor to initialize color and filled status
        this.width = width; //Initialize width with the provided value
        this.length = length; //Initialize length with the provided value
    }

    //Getter and setter methods for width and length
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Methods to calculate area and perimeter
    public double getArea(){
        return width*length;
    }

    public double getParameter(){
        return 2*(width + length);
    }

    //Override toString() method to provide a string representation of the Rectangle object
    @Override
    public String toString(){
        return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
    }
}

