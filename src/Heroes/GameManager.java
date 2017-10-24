package Heroes;

class GameManager {
    void fight(Character first, Character second) {
        //without this check eternal loop may occur
        if ((first instanceof Elf && second instanceof Elf) ||
                (first instanceof Hobbit && second instanceof Hobbit))
        {
            System.out.println("Because our brave warriors are both peaceful creatures they skipped the battle" +
                    " and went to drink beer and sing songs!");
            return;
        }
        do {
            first.kick(second);
            if (second.isAlive()) {
                second.kick(first);
            }
        }
        while (first.isAlive() && second.isAlive());
    }
}
