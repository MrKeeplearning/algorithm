package baekjoon.season01.problem1926;

import java.util.*;
import java.io.*;

public class Main {
    static int row, col;
    static int[][] paper;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        paper = new int[row][col];
        visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (paper[i][j] == 1 && !visited[i][j]) {
                    max = Math.max(max, bfs(i, j));
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.newLine();
        bw.write(String.valueOf(max));
        bw.flush();

        br.close();
        bw.close();
    }

    // 그림의 넓이를 탐색
    public static int bfs(int i, int j) {
        ArrayDeque<Node> deq = new ArrayDeque<>();
        deq.offer(new Node(i, j));
        visited[i][j] = true;
        int cnt = 1;
        while(!deq.isEmpty()) {
            Node node = deq.poll();
            for (int k = 0; k < 4; k++) {
                int nx = node.x + dx[k];
                int ny = node.y + dy[k];
                if (nx >= 0 && ny >= 0 && nx < row && ny < col) {
                    if (paper[nx][ny] == 1 && !visited[nx][ny]) {
                        deq.offer(new Node(nx, ny));
                        visited[nx][ny] = true;
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}

class Node {
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
