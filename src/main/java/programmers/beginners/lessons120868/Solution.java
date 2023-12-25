package programmers.beginners.lessons120868;

import java.util.HashSet;

public class Solution {
    public int solution(int[] sides) {
        HashSet<Integer> set = new HashSet<>();

        // 주어진 값에 가장 긴 변이 있는 경우
        int givenMax = Math.max(sides[0], sides[1]);
        int givenSide = Math.min(sides[0], sides[1]);

        int other1 = givenMax - givenSide + 1;
        while (other1 <= givenMax) {
            set.add(other1);
            other1++;
        }

        // 나머지 한 변이 가장 긴 변인 경우
        int other2 = givenMax;
        while (other2 < givenMax + givenSide) {
            set.add(other2);
            other2++;
        }

        return set.size();
    }
}