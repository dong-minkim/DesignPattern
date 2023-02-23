package FactoryMethodPattern;

/**
 * 객체를 생성하는 인터페이스를 정의하지만, 인스턴스를 만드는 클래스는 서브클래스에서 결정하도록 하는 패턴
 */
public class main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(SHAPE_TYPE.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(SHAPE_TYPE.RECTANGLE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(SHAPE_TYPE.SQUARE);
        shape3.draw();
    }
}
