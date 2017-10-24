package Heroes;

import java.util.concurrent.ThreadLocalRandom;

public class King extends Character {
    @Override
    public void kick(Character enemy) {
        System.out.println("" + this.name + " slapped enemy for " + this.power + "hp");
        enemy.setHp(enemy.getHp() - this.power);
        if (!enemy.isAlive()) {
            System.out.println("" + this.name + " won!");
        }
    }
    King(String name) {
        this.name = name;
        this.hp = ThreadLocalRandom.current().nextInt(Constants.KING_HP_MIN, Constants.KING_HP_MAX);
        this.power = ThreadLocalRandom.current().nextInt(Constants.KING_POWER_MIN, Constants.KING_POWER_MAX);
        System.out.println("King " + this.name + " created. Stats - hp: " + this.hp + ", power: " + this.power);
    }
}
