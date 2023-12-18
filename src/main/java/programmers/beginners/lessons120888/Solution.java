package programmers.beginners.lessons120888;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < my_string.length(); i++) {
            set.add(my_string.charAt(i));
        }
        for (Character c : set) {
            sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
}