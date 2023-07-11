package fr.epita.geometry.tests.calculus;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Triangle;

public class GlobalTest {

    public static void main(String[] args) {
        tddExample();


        Triangle triangle = new Triangle(10.0, 7.0, 5.0, 6.0);

        triangle.calculatePerimeter();
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
        Double truePerimeter = 20 * Math.PI * 3;
        Double trueArea = 20 * 20 * Math.PI;

        assertEquals(actualPerimeter, truePerimeter);
        assertEquals(actualArea, trueArea);
    }

    private static void assertEquals(Object actual, Object expected) {
        if (actual  != expected){
            throw new RuntimeException("mismatch between expected: "+ expected +" and actual: " + actual );
        }
    }
}
