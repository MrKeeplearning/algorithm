package programmers.beginners.lessons120851;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        ArrayList<Character> characters = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            characters.add(my_string.charAt(i));
        }
        characters.sort(Comparator.naturalOrder());

        for (Character c : characters) {
            if (c < 65) {
                answer += Character.getNumericValue(c);
            }
        }

        return answer;
    }
}