package PrototypePattern;

public class Rectangle extends Shape {
    private String type;

    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
