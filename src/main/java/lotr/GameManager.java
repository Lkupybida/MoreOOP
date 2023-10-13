package lotr;

public class GameManager {
    public static void fight(Character character1, Character character2) {
        System.out.println(character1 + " and " + character2 + " are created");
        while (character1.isAlive() && character2.isAlive()) {
            character1.kick(character2);
            if (!character2.isAlive()) {
                System.out.println(character1 + " wins!");
                break;
            }
            character2.kick(character1);
            if (!character1.isAlive()) {
                System.out.println(character2 + " wins!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();
        fight(character1, character2);
    }
}
