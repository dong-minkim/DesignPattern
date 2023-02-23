package TemplateMethodPattern;

/**
 * 객체의 연산에서 알고리즘의 뼈대만 정의하고, 나머지는 하위클래스에서 이루어지게 하는 패턴
 * -> 즉 알고리즘의 구조는 만들어놓고, 구체적인 알고리즘은 하위 클래스에서 처리한다.
 */
public class main {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
