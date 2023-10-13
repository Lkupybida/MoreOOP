package lotr;

import java.util.*;
import lombok.SneakyThrows;

public class CharacterFactory {
    private static final List<Class<? extends Character>> characterTypes = Arrays.asList(Hobbit.class, Elf.class, King.class, Knight.class);
    private static final Random random = new Random();

    @SneakyThrows
    public static Character createCharacter() {
        Class<? extends Character> characterType = characterTypes.get(random.nextInt(characterTypes.size()));
        return characterType.getDeclaredConstructor().newInstance();
    }
}
