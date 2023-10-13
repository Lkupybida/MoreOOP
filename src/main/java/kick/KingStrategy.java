package kick;

import java.util.Random;
import lotr.Character;

public class KingStrategy implements KickStrategy {

    private Random random = new Random();

    @Override
    public void kick(Character attacker, Character opponent) {
        int damage = random.nextInt(attacker.getPower()) + 1;
        System.out.println(attacker + " deals " + damage + " damage to " + opponent);
        opponent.decreaseHP(damage);
    }
}
