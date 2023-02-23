package StatePattern;

/**
 * 객체가 상태에 따라 행위를 다르게 할 때,
 * 직접 상태를 체크하여 상태에 따른 행위를 호출하는 것이 아니라
 * 상태를 객체화하여 필요에 따라 다르게 행동하도록 위임하는 디자인 패턴
 * -> 상태를 클래스로 표현한다.
 * */
public class main {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
