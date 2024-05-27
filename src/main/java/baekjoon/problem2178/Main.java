package baekjoon.problem2178;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int rowCount = Integer.parseInt(st.nextToken());
        int colCount = Integer.parseInt(st.nextToken());
        int[][] maze = new int[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            String line = br.readLine();
            for (int j = 0; j < colCount; j++) {
                maze[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }

        int result = bfs(maze);
        bw.write(String.valueOf(result));
        bw.flush();

        br.close();
        bw.close();
    }

    public static int bfs(int[][] maze) {
        int[] dx = {-1, 1, 0, 0};   // 상, 하, 좌, 우
        int[] dy = {0, 0, -1, 1};

        Deque<Position> deque = new LinkedList<>();
        deque.addLast(new Position(0, 0, 1));   // 시작 위치

        while (!deque.isEmpty()) {
            Position pos = deque.pollFirst();

            // 마지막 위치에 도달하면 최소의 칸 수를 출력한다.
            if (pos.row == maze.length - 1 && pos.col == maze[0].length - 1) {
                return pos.distance;
            }

            for (int i = 0; i < 4; i++) {
                // 상하좌우 이동해본다.
                int newRow = pos.row + dx[i];
                int newCol = pos.col + dy[i];

                // 만약 이동했을 때 좌표가 주어진 미로의 범위를 벗어나지 않고,
                // 이동할 수 있는 칸인 경우(1로 표시) 큐에 넣어 전진한다.
                // 큐에서 위치를 제거할 때마다 위치에 대한 거리를 갱신하고, 해당 위치에서 다시 한 번 BFS를 수행한다.
                if (newRow >= 0 && newRow < maze.length &&
                        newCol >= 0 && newCol < maze[0].length &&
                        maze[newRow][newCol] == 1) {
                    deque.addLast(new Position(newRow, newCol, pos.distance + 1));
                    maze[newRow][newCol] = 0;   // 방문한 노드는 0으로 표시한다.
                }
            }
        }
        // 큐에 저장된 모든 노드를 방문했음에도 도착 노드에 도달하지 못한 경우.
        return -1;
    }
}

class Position {
    int row;    // 행의 위치
    int col;    // 열의 위치
    int distance;   // 시작부터의 거리

    public Position(int row, int col, int distance) {
        this.row = row;
        this.col = col;
        this.distance = distance;
    }
}
