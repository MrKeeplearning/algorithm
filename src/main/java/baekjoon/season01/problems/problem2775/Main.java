package baekjoon.season01.problems.problem2775;

import java.io.*;

public class Main {

    public static int[][] residents = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 거주민 모두 채우기
        getResidentCount();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(residents[k][n]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();

        br.close();
        bw.close();
    }

    private static void getResidentCount() {
        // 초기화
        for (int i = 0; i < 15; i++) {
            residents[i][1] = 1;
            residents[0][i] = i;
        }

        // 1층~14층
        for (int i = 1; i < 15; i++) {
            // 2호~14호
            for (int j = 2; j < 15; j++) {
                residents[i][j] = residents[i][j - 1] + residents[i - 1][j];
            }
        }
    }
}
