package programmers.lv2.lessons42746;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String solution(int[] numbers) {
        List<String> numbersList = new ArrayList<>();
        for (int number : numbers) {
            numbersList.add(String.valueOf(number));
        }

        numbersList.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        StringBuilder sb = new StringBuilder();
        for (String s : numbersList) {
            sb.append(s);
        }

        String answer = sb.toString();
        if (answer.startsWith("0")) {
            return "0";
        }
        return sb.toString();
    }
}