package programmers.beginners.lessons120924;

public class Solution {
    public int solution(int[] common) {
        int answer = 0;

        int val1 = common[0];
        int val2 = common[1];
        int val3 = common[2];

        if (Math.abs(val2 - val1) == Math.abs(val3 - val2)) {
            answer = common[common.length - 1] + Math.abs(val3 - val2);
        }

        if (Math.abs(val2) / Math.abs(val1) == Math.abs(val3) / Math.abs(val2)) {
            answer = common[common.length - 1] * (Math.abs(val3) / Math.abs(val2));
        }

        return answer;
    }
}
