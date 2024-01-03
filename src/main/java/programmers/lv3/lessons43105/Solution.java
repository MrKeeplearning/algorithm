package programmers.lv3.lessons43105;

public class Solution {
    /**
     * 1. 첫번째 행(삼각형의 꼭대기)에서 시작해서 아래쪽 층으로 이동
     * 2. 각 단계에서 선택할 수 있는 두 개의 값 중에서 최댓값을 선택합니다. 왼쪽 대각선 아래 혹은 오른쪽 대각선 아래.
     * 3. 선택한 값을 해당 층의 최댓값으로 저장하고 다음 단계로 이동
     * 4. 최종적으로 삼각형의 가장 아래층에 도착했을 때, 그 층에 저장된 최댓값들 중 가장 큰 값이 바로 답이 된다.
     */
    public int solution(int[][] triangle) {
        // 각 단계 별 누적합을 담을 이차원 배열을 생성
        // 모든 단계가 주어진 triangle 이차원 배열을 따라서 움직이기 때문에
        // 주어진 triangle과 동일한 사이즈의 배열을 생성한다.
        int[][] dp = new int[triangle.length][triangle.length];
        // 단계별로 누적합을 구하더라도 첫 번째 값은 주어진 triangle의 동일한 위치와 같은 값을 가진다.
        dp[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {
            // 맨 좌측은 dp의 위치와 동일한 좌표의 triangle 좌표 값과 바로 직전 라인의 dp값을 합친 것만 가능하다.
            dp[i][0] = dp[i - 1][0] + triangle[i][0];
            // 맨 우측 노드
            dp[i][i] = dp[i - 1][i - 1] + triangle[i][i];
            for (int j = 1; j < i; j++) {
                  dp[i][j] = Math.max(dp[i - 1][j - 1] + triangle[i][j], dp[i - 1][j] + triangle[i][j]);
            }
        }

        // dp의 가장 마지막 줄의 첫번째 값을 최대값으로 설정하고 비교를 시작한다.
        int maxValue = dp[dp.length - 1][0];
        // 가장 마지막 줄에 총합이 담겨 있다.
        // 새로 생성한 dp의 가장 마지막 줄인 dp.length-1의 각 컬럼들에서 가장 큰 값을 찾는다.
        for (int i = 1; i < dp.length; i++) {
            maxValue = Math.max(maxValue, dp[dp.length - 1][i]);
        }
        return maxValue;
    }
}
