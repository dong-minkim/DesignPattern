package SingletonPattern;

public class SingleObject {

    // 싱글톤 객체 생성
    private static SingleObject instance = new SingleObject();

    // 생성자 생성 불가능
    private SingleObject() {
    }

    // 오직 하나 객체만 사용 보장
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton DesignPattern");
    }
}
