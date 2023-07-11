package fr.epita.geometry.datamodel;

public class Square implements Shape {
    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    public Double calculatePerimeter() {
        return this.side * 4;
    }

    public Double calculateArea() {
        return this.side * this.side;
    }
}
