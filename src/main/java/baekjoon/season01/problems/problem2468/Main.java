package baekjoon.season01.problems.problem2468;

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int MAX = Integer.MIN_VALUE;

    static int[] dx = {-1, 0, 1, 0};    // 상, 우, 하, 좌
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        int waterLevel = 1;

        // map에 입력값을 읽어 좌표값을 채운다.
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] > waterLevel) waterLevel = map[i][j];
            }
        }

        for (int h = 0; h < waterLevel; h++) {
            visited = new boolean[N][N];
            int count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // 수위보다 높고, 아직 방문하지 않은 좌표인 경우 bfs 탐색으로 침수되지 않는 한 덩어리의 영역을 찾는다.
                    if (map[i][j] > h && !visited[i][j]) {
                        bfs(i, j, h);
                        count++;
                    }
                }
            }
            MAX = Math.max(MAX, count);
        }
        bw.write(String.valueOf(MAX));
        bw.flush();

        br.close();
        bw.close();
    }

    public static void bfs(int x, int y, int waterLevel) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int X = queue.peek()[0];
            int Y = queue.peek()[1];
            queue.poll();

            // 현재 위치에서 상, 우, 하, 좌로 탐색
            for (int i = 0; i < 4; i++) {
                int nx = X + dx[i];
                int ny = Y + dy[i];

                // 정해진 범위 바깥으로 나가는 경우 다음 것을 탐색한다.
                if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
                    continue;
                }

                // 방문하지 않은 좌표이고, 수위보다 높은 경우
                if (!visited[nx][ny] && map[nx][ny] > waterLevel) {
                    // 큐에 새로운 좌표를 추가해서 해당 위치를 기준으로 상, 우, 하, 좌로 검색을 더 할 수 있도록 만든다.
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
}
