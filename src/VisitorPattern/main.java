package VisitorPattern;

/**
 * 객체구조를 이루는 원소에 대해 수행할 연산을 표현합니다.
 * 방문자는 연산에 적용할 원소의 클래스를 변경하지 않고 새로운 연산을 재정의 할 수 있습니다.
 */
public class main {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
