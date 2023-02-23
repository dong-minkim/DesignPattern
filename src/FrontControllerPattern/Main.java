package FrontControllerPattern;

/**
 * 모든 요청이 단일 Handler에 의해 처리되도록 하는 방법
 *
 * Front Controller : 어플리케이션에 들어오는 모든 종류의 요청에 대한 단일 Handler
 * Dispatcher : Front Controller는 Dispatcher를 통해 특정 Handler로 요청을 발송할 수 있음
 */
public class Main {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
