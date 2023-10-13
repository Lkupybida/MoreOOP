package kick;

import lotr.Character;

public class Cry implements KickStrategy {

    @Override
    public void kick(Character attacker, Character opponent) {
        System.out.println(attacker + " is crying");
    }
}
