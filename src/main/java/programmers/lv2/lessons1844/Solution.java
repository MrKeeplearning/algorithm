package programmers.lv2.lessons1844;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int[][] maps) {
        int rows = maps.length;
        int columns = maps[0].length;

        boolean[][] visited = new boolean[rows][columns];
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};    // 우, 좌, 아래, 위

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0, 1));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            // 맵의 경계선에 도달
            if (node.x == rows - 1 && node.y == columns - 1) {
                return node.distance;
            }

            for (int[] direction : directions) {
                int nx = node.x + direction[0];
                int ny = node.y + direction[1];
                if (nx >= 0 && ny >= 0
                        && nx < rows && ny < columns
                        && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.add(new Node(nx, ny, node.distance + 1));
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }

    static class Node {
        int x;
        int y;
        int distance;

        Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}
