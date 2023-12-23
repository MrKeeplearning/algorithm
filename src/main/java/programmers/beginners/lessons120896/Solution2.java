package programmers.beginners.lessons120896;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution2 {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        ArrayList<Character> characters = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                characters.add(entry.getKey());
            }
        }
        characters.sort(Comparator.naturalOrder());

        for (Character c : characters) {
            sb.append(c);
        }

        return sb.toString();
    }
}