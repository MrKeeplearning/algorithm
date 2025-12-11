package baekjoon.season01.problem16234;

import java.io.*;
import java.util.*;

public class Main {
    static int n, l, r;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static ArrayList<Node> countries;   // 인구 이동이 발생한 지역을 저장하는 ArrayList

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());   // 땅 크기
        l = Integer.parseInt(st.nextToken());   // 국경선을 공유하는 두 나라의 인구 차이가 l명 이상
        r = Integer.parseInt(st.nextToken());   // 국경선을 공유하는 두 나라의 인구 차이가 r명 이상

        // 땅 채우기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int days = findDays();
        bw.write(String.valueOf(days));
        bw.flush();

        br.close();
        bw.close();
    }

    // 인구 이동을 처리
    public static int findDays() {
        int dayCount = 0;
        while (true) {
            boolean isMove = false;
            visited = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j]) {
                        int sum = bfs(i, j);
                        if (countries.size() > 1) {
                            int avg = sum / countries.size();
                            for (Node country : countries) {
                                map[country.x][country.y] = avg;
                            }
                            isMove = true;
                        }
                    }
                }
            }
            if (!isMove)
                return dayCount;
            dayCount++;
        }
    }

    public static int bfs(int x, int y) {
        ArrayDeque<Node> deq = new ArrayDeque<>();
        countries = new ArrayList<>();

        deq.offer(new Node(x, y));
        countries.add(new Node(x, y));
        visited[x][y] = true;

        int sum = map[x][y];
        while (!deq.isEmpty()) {
            Node current = deq.poll();

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                    int diff = Math.abs(map[current.x][current.y] - map[nx][ny]);
                    if (l <= diff && diff <= r) {
                        deq.offer(new Node(nx, ny));
                        countries.add(new Node(nx, ny));
                        sum += map[nx][ny];
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return sum;
    }

    public static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
