package Heroes;


public abstract class Character {
    int power;
    int hp;
    String name;
    public abstract void kick(final Character enemy);
    boolean isAlive(){
        return this.hp > 0;
    }
    int getPower(){ return this.power; }
    void setPower(int power) {
        if(power > 0) {
            this.power = power;
        }
        else {
            this.power = 0;
        }
    }
    int getHp(){ return this.hp; }
    void setHp(int hp) {
        if(hp > 0) {
            this.hp = hp;
        }
        else {
            System.out.println("" + this.name + " defeated...");
            this.hp = 0;
        }
    }
}
