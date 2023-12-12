package programmers.lv1.lessons68644;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Solution3 {
    /**
     * 중복 체크 로직으로 contains를 사용하던 것(시간 복잡도 O(n))을 HashSet 사용으로 수정.
     * LinkedHashSet은 삽입했던 순서를 유지하고, Set이기 때문에 중복이 없다.
     */
    public int[] solution(int[] numbers) {
        int numbersLength = numbers.length;
        LinkedHashSet<Integer> number_combination = new LinkedHashSet<>();

        for (int i = 0; i < numbersLength - 1; i++) {
            for (int j = i + 1; j < numbersLength; j++) {
                number_combination.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> sortedList = new ArrayList<>(number_combination);
        Collections.sort(sortedList);

        return sortedList.stream().mapToInt(i -> i).toArray();
    }
}
