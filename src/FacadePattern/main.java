package FacadePattern;

/**
 * 서브시스템에 있는 인터페이스 집합에 통합된 하나의 인터페이스를 제공,
 * 서브시스템을 좀 더 쉽게 사용하기 위해 고수준의 인터페이스를 정의
 */
public class main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
