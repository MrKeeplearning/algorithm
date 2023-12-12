package programmers.beginners.lessons120837;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int solution(int hp) {

        ArrayList<Integer> antAttack = new ArrayList<>(Arrays.asList(5, 3, 1));

        int grasshopper = hp;
        int troops = 0;

        if (hp == 0) {
            return 1;
        }

        for (Integer attack : antAttack) {
            troops += getQuotient(grasshopper, attack);
            grasshopper = getRemainder(grasshopper, attack);
        }

        return troops;
    }

    public int getQuotient(int hp, int attack) {
        return hp / attack;
    }

    public int getRemainder(int hp, int attack) {
        return hp % attack;
    }
}