package StrategyPattern;

import StrategyPattern.Item.Weapon;

public class UserCharactor {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println("Attack fit");
        } else {
            weapon.attack();
        }
    }
}
