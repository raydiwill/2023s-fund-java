package fr.epita.geometry.tests.calculus;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Triangle;

public class GlobalTest {

    public static void main(String[] args) {
        //tddExample();

        //given
        double sideA = 5.0;
        double sideB = 6.0;
        double base = 10.0;
        Triangle triangle = new Triangle(base, 7.0, sideA, sideB);
        //when & then
        assertEquals(triangle.calculatePerimeter(), sideB+ sideA+ base);
        triangle.calculateArea();

    }

    private static void tddExample() {
        //given
        Circle circle = new Circle(20);

        //when
        double actualArea = circle.calculateArea();
        System.out.println("circle area: "  + actualArea);
        double actualPerimeter = circle.calculatePerimeter();
        System.out.println("circle perimeter: "  + actualPerimeter);

        //then
        Double truePerimeter = 20 * Math.PI * 2;
        Double trueArea = 20 * 20 * Math.PI;

        assertEquals(actualPerimeter, truePerimeter);
        assertEquals(actualArea, trueArea);
    }

    private static void assertEquals(Object actual, Object expected) {
        if (!String.valueOf(actual).equals(String.valueOf(expected))){
            throw new RuntimeException("mismatch between expected: "+ expected +" and actual: " + actual );
        }
    }
}
