package programmers.beginners.lessons120924;

public class Solution3 {
    public int solution(int[] common) {
        int diff = common[1] - common[0];
        boolean isArithmetic = true;

        for (int i = 2; i < common.length; i++) {
            if (common[i] - common[i - 1] != diff) {
                isArithmetic = false;
                break;
            }
        }

        int answer = 0;

        if (isArithmetic) {
            answer = common[common.length - 1] + diff;
        } else {
            int ratio = common[1] / common[0];
            answer = common[common.length - 1] * ratio;
        }

        return answer;
    }
}
