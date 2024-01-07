package programmers.lv3.lessons43162;

public class Solution {
    static int count = 0;
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        for (int[] computer : computers) {
            dfs(computer, visited, n);
        }
        return n - count;
    }

    public void dfs(int[] computer, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            visited[i] = true;
            if (!visited[i] && computer[i] == 1) {
                count++;
                dfs(computer, visited, n);
            }
        }
    }
}