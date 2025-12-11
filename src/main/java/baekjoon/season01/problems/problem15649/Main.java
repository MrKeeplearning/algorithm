package baekjoon.season01.problems.problem15649;

import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br;
    public static BufferedWriter bw;
    public static int[] arr;    // 출력할 배열
    public static boolean[] visited;    // 방문 여부 체크하는 배열

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visited = new boolean[n];

        dfs(n, m, 0);

        br.close();
        bw.close();
    }

    public static void dfs(int n, int m, int depth) throws IOException {
        // 원하는 길이만큼의 수열을 출력한다.
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                bw.write(arr[i] + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = 0; i < n; i++) {   // n까지 반복하되,
            if (!visited[i]) {          // 방문하지 않았다면,
                visited[i] = true;      // 방문함을 표시하고,
                arr[depth] = i + 1;     // 출력할 배열 arr에 i + 1 값을 저장 후
                dfs(n, m, depth + 1);   // 깊이를 1 증가시킨 후 재귀호출
                visited[i] = false;
            }
        }
    }
}
