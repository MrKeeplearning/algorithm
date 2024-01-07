package programmers.beginners.lessons120880;

import java.util.Arrays;

public class Solution2 {
    public int[] solution(int[] numlist, int n) {
        Integer[] list = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        // 새로운 comparator를 정의해서 n과 numlist 원소 간의 거리를 기준으로 정렬한다.
        // 거리가 같으면 값이 큰 순서로 정렬한다.
        Arrays.sort(list, (o1, o2) -> {
            int diff1 = Math.abs(o1 - n);
            int diff2 = Math.abs(o2 - n);
            if (diff1 == diff2) {
                return o2 - o1;
            }
            return diff1 - diff2;
        });

        // 정렬된 배열을 int 형태로 변환해서 반환한다.
        int[] result = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            result[i] = list[i];
        }
        return result;
    }
}
