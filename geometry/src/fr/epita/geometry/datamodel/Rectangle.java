package fr.epita.geometry.datamodel;

public class Rectangle implements Shape {

    private final Double length;

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    private final Double width;

    public Rectangle(Double width, Double height){
        this.width = width;
        this.length = height;
    }
    @Override
    public Double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * this.length + 2 * this.width;
    }
}
