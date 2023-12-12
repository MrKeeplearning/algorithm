package programmers.lv1.lessons68644;

import java.util.Set;
import java.util.TreeSet;

public class Solution4 {
    public int[] solution(int[] numbers) {
        Set<Integer> number_combination = new TreeSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                number_combination.add(numbers[i] + numbers[j]);
            }
        }
        return number_combination.stream().mapToInt(a -> a).toArray();
    }
}
