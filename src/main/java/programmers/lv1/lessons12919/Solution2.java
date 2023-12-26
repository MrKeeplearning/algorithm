package programmers.lv1.lessons12919;

import java.util.Arrays;

public class Solution2 {
    public String solution(String[] seoul) {
        int indexOfKim = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + indexOfKim + "에 있다";
    }
}
