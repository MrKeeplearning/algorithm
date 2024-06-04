package baekjoon.problem7576;

import java.io.*;
import java.util.*;

// 1. BFS를 사용해서 모든 토마토가 익는데 필요한 최소 일수를 구한다.
// 2. 모든 익은 토마토를 시작노드로 설정하고 탐색 시작
// 3. 방문하지 않은 익지 않은 토마토를 발견하면 그 토마토를 익게 만들고, 해당 토마토의 위치를 큐에 추가한다.
// 4. 모든 노드를 방문할 때까지 2와 3의 과정을 반복한다.
// 5. 모든 노드를 방문한 뒤에 그래프에 남아 있는 익지 않은 토마토가 있는지 확인한다.
//    익지 않은 토마토가 남아 있으면 모든 토마토를 익게 만들 수 없는 상태 => -1
//    그렇지 않으면 모든 토마토가 익은 상태 => 지난 날짜 출력
public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int colCount, rowCount;
    static int[][] map;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        colCount = Integer.parseInt(st.nextToken());
        rowCount = Integer.parseInt(st.nextToken());
        ArrayDeque<Node> deq = new ArrayDeque<>();
        
        map = new int[rowCount][colCount];

        for (int r = 0; r < rowCount; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < colCount; c++) {
                map[r][c] = Integer.parseInt(st.nextToken());
                // map의 모든 점을 돌면서 익은 토마토를 덱에 추가
                if (map[r][c] == 1) deq.add(new Node(r, c, 0));
            }
        }
        BFS(deq);

        br.close();
        bw.close();
    }

    static void BFS(ArrayDeque<Node> deq) throws IOException {
        int day = 0;
        while(!deq.isEmpty()) {
            Node node = deq.poll();
            day = node.day;

            for (int i = 0; i < 4; i++) {
                int nx = node.row + dx[i];
                int ny = node.col + dy[i];

                if (nx < 0 || ny < 0 || nx >= rowCount || ny >= colCount) continue;
                if (map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    deq.add(new Node(nx, ny, day + 1));
                }
            }
        }

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (map[i][j] == 0) {
                    bw.write("-1");
                    return;
                }
            }
        }

        bw.write(String.valueOf(day));
        bw.flush();
    }

    static class Node {
        int row, col, day;
        Node(int row, int col, int day) {
            this.row = row;
            this.col = col;
            this.day = day;
        }
    }
}
