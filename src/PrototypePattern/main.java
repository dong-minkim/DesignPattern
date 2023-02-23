package PrototypePattern;

/**
 * 생성할 객체의 종류를 명시하는 데 원형이 되는 예시물을 이용하고 새로운 객체를 이 원형들을 복사함으로써 생성하는 패턴
 *
 * 복사해서 인스턴스를 만든다.
 */
public class main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
