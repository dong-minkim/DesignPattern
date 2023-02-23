package BridgePattern;

/**
 * 구현부에 추상층을 분리하여 각자 독립적으로 변형할 수 있도록 하는 패턴
 *
 * 기능의 계층과 구현의 계층을 분리
 */
public class main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
