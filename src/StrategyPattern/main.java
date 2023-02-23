package StrategyPattern;

import StrategyPattern.Item.Knife;
import StrategyPattern.Item.Sword;


/**
 * 동일 계열의 알고리즘들을 정의하고, 각 알고리즘을 캡슐화하며 이들을 상호교체 가능하도록 만드는 것
 */
public class main {
    public static void main(String[] args) {
        UserCharactor character = new UserCharactor();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();
    }
}
