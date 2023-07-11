package fr.epita.geometry.datamodel;

public class Square extends Rectangle implements Shape {

    public Square(Double side) {
        super(side, side);
    }

    public Double calculatePerimeter() {
        return super.calculatePerimeter();
    }

    public Double calculateArea() {
        return super.calculateArea();
    }
}
