package kick;

import lotr.Character;

public class ElfKick implements KickStrategy {

    @Override
    public void kick(Character attacker, Character opponent) {
        if (attacker.getPower() > opponent.getPower()) {
            System.out.println(attacker + " kills " + opponent);
            opponent.setHp(0);
        } else {
            System.out.println(attacker + " deals 1 damage to " + opponent);
            opponent.decreaseHP(1);
        }
    }
}
