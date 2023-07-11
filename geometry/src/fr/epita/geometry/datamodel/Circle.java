package fr.epita.geometry.datamodel;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public Double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
