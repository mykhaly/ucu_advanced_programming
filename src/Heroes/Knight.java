package Heroes;

import java.util.concurrent.ThreadLocalRandom;

public class Knight extends Character {
    @Override
    public void kick(Character enemy) {
        System.out.println("" + this.name + " slapped enemy for " + this.power + "hp");
        enemy.setHp(enemy.getHp() - this.power);
        if (!enemy.isAlive()) {
            System.out.println("" + this.name + " won!");
        }
    }
    Knight(String name) {
        this.name = name;
        this.hp = ThreadLocalRandom.current().nextInt(Constants.KNIGHT_HP_MIN, Constants.KNIGHT_HP_MAX);
        this.power = ThreadLocalRandom.current().nextInt(Constants.KNIGHT_POWER_MIN, Constants.KNIGHT_POWER_MAX);
        System.out.println("Knight " + this.name + " created. Stats - hp: " + this.hp + ", power: " + this.power);
    }
}
