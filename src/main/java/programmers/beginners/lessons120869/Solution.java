package programmers.beginners.lessons120869;

import java.util.*;

public class Solution {
    public int solution(String[] spell, String[] dic) {
        List<String> sortedSpellList = Arrays.asList(spell);
        sortedSpellList.sort(String::compareTo);

        String sortedSpell = String.join("", sortedSpellList);

        for (String word : dic) {
            char[] dicCharacters = word.toCharArray();
            Arrays.sort(dicCharacters);

            if (String.valueOf(dicCharacters).equals(sortedSpell)) {
                return 1;
            }
        }

        return 2;
    }
}