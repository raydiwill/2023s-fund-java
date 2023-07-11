package fr.epita.geometry.datamodel;

public class SquareByComposition implements Shape {

    Rectangle rectangle;


    public SquareByComposition(Double side){
        rectangle = new Rectangle(side, side);
    }


    @Override
    public Double calculateArea() {
        return rectangle.calculateArea();
    }

    @Override
    public Double calculatePerimeter() {
        return rectangle.calculatePerimeter();
    }

    public Double getSide(){
        return rectangle.getWidth();
    }
}
