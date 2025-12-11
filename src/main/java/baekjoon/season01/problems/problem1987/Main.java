package baekjoon.season01.problems.problem1987;

import java.io.*;
import java.util.*;

public class Main {
    static int row, col;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static HashMap<Character, Boolean> alphabet;
    static char[][] board;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        // 알파벳 별 방문여부를 담는 map 초기화
        alphabet = new HashMap<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.put(c, false);
        }

        // board에 모든 입력값 채우기
        board = new char[row][col];
        for (int i = 0; i < row; i++) {
            String line = br.readLine();
            for (int j = 0; j < col; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        answer = 0;
        alphabet.put(board[0][0], true);
        searchAlphabet(new Node(0, 0, 1));
        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }

    public static void searchAlphabet(Node node) {
        answer = Math.max(answer, node.count);

        for (int i = 0; i < 4; i++) {
            int nx = node.x + dx[i];
            int ny = node.y + dy[i];
            // 범위를 넘어서는 경우
            if (nx < 0 || ny < 0 || nx >= row || ny >= col) {
                continue;
            }
            // 이미 방문한 경우
            if (alphabet.get(board[nx][ny])) {
                continue;
            }

            alphabet.put(board[nx][ny], true);
            searchAlphabet(new Node(nx, ny, node.count + 1));
            alphabet.put(board[nx][ny], false);
        }
    }

    public static class Node {
        int x, y, count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
