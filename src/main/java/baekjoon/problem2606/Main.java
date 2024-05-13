package baekjoon.problem2606;

import java.util.*;
import java.io.*;

public class Main {

    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;  // 1번을 포함해서 감염된 컴퓨터의 수

    // 현재 내가 몇 번째 인덱스를 처리하고 있는지를 인자로 받아 동작한다.
    public static void dfs(int index) {
        visited[index] = true;  // 현재 인덱스는 방문한 것이니 다시 방문하면 안됨.
        answer++;   // dfs 함수가 호출되는 횟수만큼 몇 개의 컴퓨터가 연결되었는지를 의미한다. 1번과 연결된 컴퓨터의 개수를 계속 기록한다.

        for (int i = 0; i <= N; i++) {
            // i번 컴퓨터에 방문하지 않았고, 현재 인덱스번 컴퓨터와 i번 컴퓨터가 연결되어 있다면 dfs 재귀함수를 통해서 i번 컴퓨터에 방문한다.
            if (!visited[i] && graph[index][i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());    // 7
        M = Integer.parseInt(br.readLine());    // 6

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        // 그래프에 연결 정보 채우기
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        // 재귀함수 호출
        dfs(1);

        // 출력
        // 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수(answer에서 1번 제외해야 함)
        bw.write(String.valueOf(answer - 1));

        br.close();
        bw.close();
    }
}

