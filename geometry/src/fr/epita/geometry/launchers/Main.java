package fr.epita.geometry.launchers;

import fr.epita.geometry.datamodel.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(20);
        Circle circle2 = new Circle(20);

        Triangle triangle = new Triangle(1.0, 2.0, 4.0,5.0);
        Triangle triangle2 = new Triangle(1.0, 2.0, 4.0,5.0);


        Square square1 = new Square(30.0);
        Square square2 = new Square(30.0);
        Square square3 = new Square(30.0);
        Square square4 = new Square(30.0);

        square1.getWidth();

        SquareByComposition square = new SquareByComposition(30.0);

        Double globalArea = 0.0;
        List<Square> squares = Arrays.asList(square1, square2, square3, square4);
        for (int i = 0; i < squares.size(); i++) {
            globalArea += squares.get(i).calculateArea();
        }
        List<Circle> circles = Arrays.asList(circle, circle2);
        for (int i = 0; i < circles.size(); i++) {
            globalArea += circles.get(i).calculateArea();
        }
        List<Triangle> triangles = Arrays.asList(triangle, triangle2);
        for (int i = 0; i < triangles.size(); i++) {
            globalArea += triangles.get(i).calculateArea();
        }

        Rectangle rectangle1 = new Rectangle(2.0,2.0);
        Rectangle rectangle2 = new Rectangle(2.0,2.0);
        List<Shape> shapes = Arrays.asList(triangle, triangle2, circle,circle2, square1, square2, square3, square4, rectangle1, rectangle2);
        for (int i = 0; i < shapes.size(); i++) {
            globalArea += shapes.get(i).calculateArea();
        }


        System.out.println("globalArea:" + globalArea);



    }
}
