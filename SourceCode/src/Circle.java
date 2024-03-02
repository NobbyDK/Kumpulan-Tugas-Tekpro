/**
* The Circle class models a circle with a radius and color.
* <Tugas week6>
* Author  : Nobby Dharma Khaulid
* NIM     : 231524020
* Tanggal : 29 Februari 2023
*/
public class Circle { // Save as "Circle.java"
 // private instance variable, not accessible from outside this class
 private double radius;
 private String color;
  // Constructors (overloaded)
 /** Constructs a Circle instance with default value for radius and color */
 public Circle() { // 1st (default) constructor
    radius = 1.0;
    color = "red";
    }
   
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
    radius = r;
    color = "red";
    }

    /** New Constructors */
    public Circle(double Radius, String color ){
        radius = Radius;
        this.color = color;
    }
   
    /** Returns the radius */
    public double getRadius() {
    return radius;
    }
   
    /** Returns the area of this Circle instance */
    public double getArea() {
    return radius*radius*Math.PI;
    }

    /**Returns the Color */
    public String getColor() {
        return color;
    }

    
    public void setColor(String color) {
        this.color = color;
    }

    /** Return a self-descriptive string of this instance in the form of
   Circle[radius=?,color=?] */
    public String toString() {
    return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
   