package ProxyPattern;

/**
 * 어떤 다른 객체로 접근하는 것을 통제하기 위해 그 객체의 매니저 또는 자리 채움자를 제공하는 패턴
 */
public class main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 이미지 display 됨
        image.display();
        System.out.println("");

        // 이미지 display 안됨
        image.display();
    }
}
