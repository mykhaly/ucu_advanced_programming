package Heroes;

class CharacterFactory {
    Character createCharacter(String className, String characterName){
        if (className.equals(Constants.NAME_HOBBIT)) {
            return new Hobbit(characterName);
        }
        else if (className.equals(Constants.NAME_ELF)) {
            return new Elf(characterName);
        }
        else if (className.equals(Constants.NAME_KING)) {
            return new King(characterName);
        }
        else {
            return new Knight(characterName);
        }
    }
}
