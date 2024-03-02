/**
* <Tugas week6>
* Author  : Nobby Dharma Khaulid
* NIM     : 231524020
* Tanggal : 29 Februari 2023
 */

public class TestProgram {  //program to display the output of each class
    public static void main(String[] args) {
        
        //display Shape
        Shape shape = new Shape("Red", false);
        System.out.println("Shape :\t\t" + "Color = " + shape.getColor()+"," + " Filled = " + shape.isFilled());
        System.out.println(shape.toString() + "\n");

        //display circle
        Circle circle = new Circle(3.0, "Green", true);
        System.out.println("Circle :\t" + "Parameter = " + circle.getParameter() + "," + " Area = " + circle.getArea());
        System.out.println(circle.toString() + "\n");

        //display rectangle
        Rectangle rectangle = new Rectangle(2.5, 2.5,  "Green", true);
        System.out.println("Rectangle :\t" + "Parameter = " + rectangle.getParameter() + "," + " Area = " + rectangle.getArea());
        System.out.println(rectangle.toString() + "\n");

        //display square
        Square square = new Square(1.0);
        System.out.println("Square :\t" + "Parameter = " + square.getParameter() + "," + " Area = " + square.getArea());
        System.out.println(square.toString() + "\n");
    }
}
