package baekjoon.season01.problem21736;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;
    static int N, M;
    static char[][] campus;
    static int[] dx = {-1, 0, 1, 0};    // 위, 왼쪽, 아래, 오른쪽 
    static int[] dy = {0, -1, 0, 1};
    static int iRow, iCol;  // 'I'의 위치

    static class Point{
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // 좌표가 캠퍼스 내부에 있는지 판별
    static boolean isInsideCampus(int nx, int ny) {
        return nx >= 0 && ny >= 0 && nx < N && ny < M;
    }

    static void BFS(int x, int y) throws IOException {
        ArrayDeque<Point> deq = new ArrayDeque<>();
        boolean[][] visited = new boolean[N][M];
        deq.offer(new Point(x, y));
        visited[x][y] = true;
        int count = 0;  // 도연이가 만난 사람의 수

        while (!deq.isEmpty()) {
            Point currentPoint = deq.pollFirst();

            // 상하좌우 네 방향으로 모두 탐색한다.
            for (int dir = 0; dir < 4; dir++) {
                int nx = currentPoint.x + dx[dir];
                int ny = currentPoint.y + dy[dir];

                // 만약 주어진 2차원 배열의 범위를 넘어선 공간에 위치한다면 다음 위치를 탐색해야 한다.
                if (!isInsideCampus(nx, ny)) continue;
                // 마찬가지로, 벽으로 막힌 X를 맞이했거나, 이미 방문한 위치인 경우 다음 위치를 탐색해야 한다.
                if (visited[nx][ny] || campus[nx][ny] == 'X') continue;
                // 도연이가 사람을 만나면 count 값을 증가시킨다.
                if (campus[nx][ny] == 'P') count++;

                // 방문했으니 visited 배열에 true로 체크하고 다시 해당 Point를 Deque에 추가한다.
                // 왜 Deque에 다시 넣을까?
                // 하나의 노드를 방문하고 나면 해당 노드의 이웃한 노드를 덱에 넣는다.
                // 이렇게 하면 항상 덱에 있는 노드들은 항상 현재 노드에 인접한 노드가 된다.
                // 이후에 덱에서 노드를 하나씩 꺼내와서 다시 해당 노드의 이웃한 노드들을 찾고, 그것들을 다시 덱에 넣는다.
                // 즉, 아직 방문하지 않은 모든 이웃 노드들을 찾아 덱에 추가하는 것이다. 이를 통해서 모든 노드를 순차적으로 방문할 수 있다.
                visited[nx][ny] = true;
                deq.offer(new Point(nx, ny));
            }
        }

        if (count == 0) {
            bw.write("TT");
        } else {
            bw.write(String.valueOf(count));
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            campus = new char[N][M];

            for (int i = 0; i < N; i++) {
                String line = br.readLine();
                for (int j = 0; j < M; j++) {
                    campus[i][j] = line.charAt(j);
                    if (campus[i][j] == 'I') {
                        iRow = i;
                        iCol = j;
                    }
                }
            }
            // 최초 BFS 탐색은 도연이의 위치에서 시작한다.
            BFS(iRow, iCol);

            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
