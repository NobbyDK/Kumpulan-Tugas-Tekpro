/**
* <Tugas week6>
* Author  : Nobby Dharma Khaulid
* NIM     : 231524020
* Tanggal : 29 Februari 2023
 */

 //shape class
public class Shape {
    private String color;
    private boolean filled;

    //Constructors 
    public Shape(){
        this.color = "Green";//Default color is green
        this.filled = true; //Default filled status is true
    }

    public Shape(String color, boolean filled){
        this.color = color; //Initialize color with the provided value
        this.filled = filled; //Initialize filled status with the provided value
    }

    //Getter and setter methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //toString() method to provide a string representation of the Shape object
    @Override
    public String toString(){
        String filledStatus = filled ? "Filled" : "Not Filled";
        return "A Shape with color of " + color + " and " + filledStatus;
    }
}

