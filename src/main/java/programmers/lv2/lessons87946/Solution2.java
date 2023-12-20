package programmers.lv2.lessons87946;

public class Solution2 {
    static int answer = 0;
    static int temp = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        Solution main = new Solution();
        d(k, dungeons, visited);
        return answer;
    }

    void d(int k, int[][] dungeons, boolean[] visited) {
        if (temp > answer) {
            answer = temp;
        }
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] == false && k >= dungeons[i][0]) {
                visited[i] = true;
                temp++;
                k -= dungeons[i][1];
                d(k, dungeons, visited);
                visited[i] = false;
                temp--;
                k += dungeons[i][1];
            }
        }
    }
}