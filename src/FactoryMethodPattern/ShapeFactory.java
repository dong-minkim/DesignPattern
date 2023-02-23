package FactoryMethodPattern;

public class ShapeFactory {
    public Shape getShape(SHAPE_TYPE type) {
        switch (type) {
            case CIRCLE:
                return new Circle();

            case RECTANGLE:
                return new Rectangle();

            case SQUARE:
                return new Square();

            default:
                break;
        }

        return null;
    }
}
