package programmers.beginners.lessons120880;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[] solution(int[] numlist, int n) {
        // numList를 List 형태로 변환
        List<Integer> list = new ArrayList<>();
        for (int num : numlist) {
            list.add(num);
        }

        Comparator<Integer> comparator = (o1, o2) -> {
            int diff1 = Math.abs(o1 - n);
            int diff2 = Math.abs(o2 - n);

            // distance가 같으면 값이 더 큰 숫자를 원하는 위치에 둔다.
            if (diff1 == diff2) {
                return o2 - o1;
            }
            // distance가 다르면 더 작은 distance를 가진 숫자를 원하는 위치에 둔다.
            return diff1 - diff2;
        };

        // 정렬을 수행한다.
        list.sort(comparator);
        // list를 int 배열로 변환하고 반환한다.
        return list.stream().mapToInt(i -> i).toArray();
    }
}