package Heroes;

public class Hobbit extends Character {
    @Override
    public void kick(Character enemy) {
        // this is meme
        // https://cs8.pikabu.ru/images/big_size_comm/2017-08_2/150202124913212990.jpg
        System.out.println("" + this.name + " couldn't kick enemy because he has paws T_T.");
    }

    Hobbit(String name) {
        this.name = name;
        this.hp = Constants.HOBBIT_HP;
        this.power = Constants.HOBBIT_POWER;
        System.out.println("Hobbit " + this.name + " created. Stats - hp: " + this.hp + ", power: " + this.power);
    }
}
