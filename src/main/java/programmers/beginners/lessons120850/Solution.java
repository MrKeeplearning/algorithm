package programmers.beginners.lessons120850;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> integers = new ArrayList<>();
        String onlyNumbers = my_string.replaceAll("[^0-9]", "");
        for (char c : onlyNumbers.toCharArray()) {
            integers.add(Character.getNumericValue(c));
        }
        integers.sort(Comparator.naturalOrder());

        return integers.stream().mapToInt(i -> i).toArray();
    }
}