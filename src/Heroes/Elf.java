package Heroes;

public class Elf extends Character {
    @Override
    public void kick(Character enemy) {
        int enemyHp = enemy.getHp();
        if(enemyHp < this.hp){
            enemy.setHp(0);
            System.out.println("" + this.name + " won!");
        }
        else {
            System.out.println("" + this.name + " decreased power of enemy by 1.");
            //without this check eternal loop may occur
            if (enemy.getPower() > 1) {
                enemy.setPower(enemy.getPower() - 1);
            }
        }
    }

    Elf(String name) {
        this.name = name;
        this.power = Constants.ELF_POWER;
        this.hp = Constants.ELF_HP;
        System.out.println("Elf " + this.name + " created. Stats - hp: " + this.hp + ", power: " + this.power);
    }
}
