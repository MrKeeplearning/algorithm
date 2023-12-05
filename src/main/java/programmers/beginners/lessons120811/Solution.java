package programmers.beginners.lessons120811;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        return Arrays.stream(array)
                .sorted()
                .toArray()[array.length / 2];
    }

    // 남의 풀이
    public int solution2(int[] array) {
        Arrays.sort(array);
        // 시프트 연산으로 나누기 2 표현하는 방법
        //return array[array.length >> 1];

        return array[array.length / 2];
    }
}