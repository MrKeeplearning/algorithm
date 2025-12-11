package baekjoon.season01.problems.problem11724;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    // 문제에서 N이 가질 수 있는 최대값이 1000에 10을 더한 값을 MAX로 설정
    // MAX는 graph와 visited를 만들기 위해서 사용할 예정
    // 원래는 1000 + 1개를 만들어야 하지만, 넉넉하게 +10로 잡은 것.
    // 10개를 더해서 시간낭비가 될 수 있는 까다로운 예외처리를 한 번에 끝낼 수도 있다.
    final static int MAX = 1000 + 10;
    static boolean graph[][];
    static boolean visited[];
    static int N, M;
    static int answer;

    public static void dfs(int idx) {
        visited[idx] = true;
        for (int i = 1; i <= N; i++) {
            // 인덱스 번의 요소와 i번의 요소가 연결되어 있어야 방문 가능
            if (visited[i] == false && graph[idx][i]) {
                dfs(i);
            }

        }
    }

    public static void main(String[] args) throws IOException {
        /**
         * 0. 입력과 초기화
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = parseInt(st.nextToken());
        M = parseInt(st.nextToken());

        /**
         * 1. graph에 연결정보 채우기
         */
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = true;
            graph[v][u] = true;
        }

        /**
         * 2. dfs 호출
         *
         * visited 배열이 인덱스 0을 제외하고 모두 true가 될 때까지 반복해야 한다.
         * for문을 사용한 반복문은 1번부터 N번까지 모두 반복한다.
         * if문의 제약조건 없이 DFS의 i를 호출하면 이미 방문한 정점을 또 다시 방문하게 된다.
         * 따라서 visited의 i가 false라면, 즉 아직 방문한 적이 없으면 해당 정점을 기준으로 DFS를 수행하면 된다.
         * dfs 함수를 호출해서 dfs 순회를 완료하면 관련된 정점은 모두 true가 된다.
         * 즉, 하나의 덩어리가 완성된 것이다. 이 때 answer의 값을 1증가시켜 최종적으로 연결 요소의 개수를 구할 수 있도록 한다.
         */
        for (int i = 1; i <= N; i++) {
            if (visited[i] == false) {
                dfs(i);
                answer++;
            }
        }

        /**
         * 3. 출력
         */
        bw.write(String.valueOf(answer));
        br.close();
        bw.close();
    }
}
