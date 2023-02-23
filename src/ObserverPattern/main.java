package ObserverPattern;

/**
 * 객체들 사이에 1 : N 의 의존관계를 정의하여 어떤 객체의 상태가 변할 때,
 * 의존관계에 있는 모든 객체들이 통지받고 자동으로 갱신될 수 있게 만드는 패턴
 *
 * -> 상태 변화를 통지!!
 */
public class main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
