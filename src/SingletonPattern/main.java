package SingletonPattern;

/**
 * 클래스의 인스턴스가 하나임을 보장하고 접근할 수 있는 전역적인 접근점을 제공하는 패턴 */
public class main {
    public static void main(String[] args) {

        // 생성자 불가
        // SingleObject object = new SingleObject();

        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
