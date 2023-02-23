package CommandPattern;

/**
 * 요청을 객체로 캡슐화하여 서로 다른 사용자의 매개변수화, 요청 저장 또는 로깅, 연산의 취소를 지원하게 만드는 패턴
 *
 * -> 명령을 클래스로 만든다.
 */
public class main {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
