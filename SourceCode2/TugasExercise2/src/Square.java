/**
* <Tugas week6>
* Author  : Nobby Dharma Khaulid
* NIM     : 231524020
* Tanggal : 29 Februari 2023
 */

 //Square class
public class Square extends Rectangle {

    // Constructors
    public Square(){
        super(1.0, 1.0);    //Call superclass constructor with default values for width and length
    }

    public Square(double side){
        super (side, side); //Call superclass constructor with the same value for width and length
    }
    
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);   //Call superclass constructor with the same value for width and length, along with color and filled parameters
    }

    //Getter method to get the side of the square
    public double getSide(){
        return super.getWidth();    //Since width and length are the same, we can use either to represent the side of the square
    }

    //Setter method to set the side of the square
    public void setSide(double side){
        super.setLength(side);  //Set length to the provided side value
        super.setWidth(side);   //Set width to the provided side value
    }

    //Override getArea() method to calculate area of the square
    @Override
    public double getArea(){        // Constructors
        return getSide()*getSide(); //Area of square is side * side
    }

    //getParameter() method to calculate perimeter of the square
    public double getParameter(){     // Constructors
        return 4*getSide(); //Perimeter of square is 4 * side
    }

     //Override setWidth() and setLength() methods to maintain square geometry
    @Override
    public void setLength(double side){
        super.setLength(side); //Set length to the provided side value
        super.setWidth(side); //Set width to the provided side value
    }

    
    @Override
    public void setWidth(double side){
        super.setLength(side); // Set length to the provided side value
        super.setWidth(side); // Set width to the provided side value
    }

    //Override toString() method
    @Override
    public String toString(){
        return "A Square with side =" + getSide() + ", Which is a subclass of " + super.toString();
    }
}

