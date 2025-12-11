package baekjoon.season01.problem14940;

import java.io.*;
import java.util.*;

// 입력값을 읽으면서 가장 먼저 시작점에 해당되는 2의 좌표를 구한다.
// BFS 로 2의 위치에서부터 상하좌우로 움직이며 모든 지점에 대한 거리를 구한다.
public class Main {
    static BufferedReader br;
    static BufferedWriter bw;
    static int n, m;
    static int targetRow, targetCol;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};    // 상하좌우
    static int[] dy = {0, 0, -1, 1};

    static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static boolean isInsideMap(int nx, int ny) {
        return nx >= 0 && ny >= 0 && nx < n && ny < m;
    }

    static void BFS(int x, int y) throws IOException {
        ArrayDeque<Point> deq = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        deq.offer(new Point(x, y));
        visited[x][y] = true;
        map[x][y] = 0;  // 최초 시작점인 2는 0으로 바꿔야 한다.

        while (!deq.isEmpty()) {
            Point currentPoint = deq.pollFirst();

            for (int dir = 0; dir < 4; dir++) {
                int nx = currentPoint.x + dx[dir];
                int ny = currentPoint.y + dy[dir];

                if (!isInsideMap(nx, ny)) continue;
                if (visited[nx][ny] || map[nx][ny] == 0) continue;

                map[nx][ny] = map[currentPoint.x][currentPoint.y] + 1;
                visited[nx][ny] = true;
                deq.offer(new Point(nx, ny));
            }
        }

        // 1인 땅 중에서 도달할 수 없는 위치는 -1로 갱신
        // BFS를 모두 순회한 뒤에도 1로 남아 있다면 도달하지 못했다는 뜻이다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    map[i][j] = -1;
                }
                bw.write(map[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
    }

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());   // 세로의 크기
            m = Integer.parseInt(st.nextToken());   // 가로의 크기
            map = new int[n][m];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    if (map[i][j] == 2) {
                        targetRow = i;
                        targetCol = j;
                    }
                }
            }

            BFS(targetRow, targetCol);

            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
