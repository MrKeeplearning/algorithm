package programmers.lv3.lessons43105;

/**
 * 1. 가장 아래층에서부터 시작해서 위의 층으로 올라간다.
 * 2. 각 단계에서 선택할 수 있는 두 개의 값 중에서 최댓값을 선택한다.
 * 3. 선택한 값을 해당 층의 최댓값으로 저장한다.
 * 4. 최종적으로 꼭대기까지 도달했을 때, 저장된 값이 바로 답이 된다.
 */
public class Solution2 {
    public int solution(int[][] triangle) {
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // 현재 위치에서 내려갈 수 있는 두 가지 경로 중 최댓값을 자신과 합쳐서 저장
                // 각 단계에서 가능한 최댓값만을 고려하면서 삼각형의 꼭대기까지 올라간다.
                triangle[i][j] += Math.max(triangle[i+1][j], triangle[i+1][j+1]);
            }
        }
        return triangle[0][0];
    }
}
