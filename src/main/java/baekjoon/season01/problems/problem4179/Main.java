package baekjoon.season01.problems.problem4179;

import java.util.*;
import java.io.*;

/**
 * 틀린 풀이!!!
 */
public class Main {
    static int R, C;
    static char[][] maze;
    static boolean[][] visitedJihoon;
    static ArrayDeque<Node> deq = new ArrayDeque<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        maze = new char[R][C];
        visitedJihoon = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            maze[i] = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                if (maze[i][j] == 'J') {
                    visitedJihoon[i][j] = true;
                    deq.offer(new Node(i, j, 0, false));
                } else if (maze[i][j] == 'F') {
                    deq.offer(new Node(i, j, 0, true));
                }
            }
        }

        if (bfs() == -1) {
            bw.write("IMPOSSIBLE");
        } else {
            bw.write(String.valueOf(result));
        }
        bw.flush();

        br.close();
        bw.close();
    }

    public static int bfs() {
        while (!deq.isEmpty()) {
            Node currentNode = deq.poll();

            for (int i = 0; i < 4; i++) {
                int nx = currentNode.x + dx[i];
                int ny = currentNode.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
                    if (!currentNode.isFire) {
                        result = currentNode.time + 1;
                        return result;
                    } else {
                        continue;
                    }
                }

                if (maze[nx][ny] == '#') {
                    continue;
                }

                if (currentNode.isFire && maze[nx][ny] != 'F') {
                    maze[nx][ny] = 'F';
                    deq.offer(new Node(nx, ny, currentNode.time + 1, true));
                }

                if (!currentNode.isFire && maze[nx][ny] == 'F' && !visitedJihoon[nx][ny]) {
                    visitedJihoon[nx][ny] = true;
                    deq.offer(new Node(nx, ny, currentNode.time + 1, false));
                }
            }
        }
        return -1;
    }
}

class Node {
    int x, y, time;
    boolean isFire;

    public Node(int x, int y, int time, boolean isFire) {
        this.x = x;
        this.y = y;
        this.time = time;
        this.isFire = isFire;
    }
}