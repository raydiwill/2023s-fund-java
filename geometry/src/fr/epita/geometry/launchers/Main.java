package fr.epita.geometry.launchers;

import fr.epita.geometry.datamodel.Circle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(20);

        System.out.println("circle area: "  + circle.calculateArea());
        System.out.println("circle perimeter: "  + circle.calculatePerimeter());


    }
}
