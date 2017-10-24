package Heroes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(final String[] args) {
        CharacterFactory factory = new CharacterFactory();
        GameManager manager = new GameManager();
        List<String> character_names = Arrays.asList(
                Constants.NAME_HOBBIT,
                Constants.NAME_ELF,
                Constants.NAME_KING,
                Constants.NAME_KNIGHT);
        Random randomizer = new Random();
        for (int i = 0; i < 1000; i++) {
            String first_name = GiveMeRandomNamePls.getNewRandomName();
            String second_name = GiveMeRandomNamePls.getNewRandomName();
            Character first = factory.createCharacter(character_names.get(randomizer.nextInt(character_names.size())),
                    first_name);
            Character second = factory.createCharacter(character_names.get(randomizer.nextInt(character_names.size())),
                    second_name);
            manager.fight(first, second);
            System.out.println("\n\n");
        }
    }
}
