package programmers.beginners.lessons120888;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution2 {
    public String solution(String my_string) {
        String[] split = my_string.split("");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(split));

        return String.join("", set);
    }
}
