package programmers.beginners.lessons120924;

public class Solution2 {
    public int solution(int[] common) {
        int diff = common[1] - common[0];
        int ratio = common[1] / common[0];
        boolean isArithmetic = true;    // 등차수열 여부
        boolean isGeometric = true;     // 등비수열 여부

        for (int i = 2; i < common.length; i++) {
            if (common[i] - common[i - 1] != diff) {
                isArithmetic = false;
            }
            if (common[i] / common[i - 1] != ratio) {
                isGeometric = false;
            }
        }

        int answer = 0;

        if (isArithmetic) {
            answer = common[common.length - 1] + diff;
        } else if (isGeometric) {
            answer = common[common.length - 1] * ratio;
        }

        return answer;
    }
}
