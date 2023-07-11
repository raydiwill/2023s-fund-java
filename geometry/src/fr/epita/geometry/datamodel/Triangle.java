package fr.epita.geometry.datamodel;

public class Triangle implements Shape {


    public Double getBase() {
        return base;
    }

    public Double getHeight() {
        return height;
    }

    public Double getSideA() {
        return sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    private final Double base;
    private final Double height;
    private final Double sideA;
    private final Double sideB;

    public Triangle(Double base, Double height, Double sideA, Double sideB){

        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Double calculatePerimeter() {
        return sideA + sideB + base;
    }

    public Double calculateArea() {
        return 0.0;
    }
}
