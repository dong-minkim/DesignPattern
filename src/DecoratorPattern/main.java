package DecoratorPattern;

/**
 * 주어진 상황 및 용도에 따라 어떤 객체에 책임을 덧붙이는 패턴
 * 기능확장이 필요할 때 서브클래스 대신 쓸 수 있는 대안이 된다.
 */
public class main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
