package lotr;

import java.util.Random;
import kick.KingStrategy;

public class King extends Character {
    public King() {
        super(new Random().nextInt(11)+ 5,
                new Random().nextInt(11) + 5,
                new KingStrategy());
    }

}