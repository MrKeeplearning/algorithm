package baekjoon.problem11048;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int rowCount = Integer.parseInt(st.nextToken());
        int colCount = Integer.parseInt(st.nextToken());

        int[][] maze = new int[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < colCount; j++) {
                maze[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = new int[rowCount][colCount];
        dp[0][0] = maze[0][0];
        for (int i = 1; i < rowCount; i++) {
            dp[i][0] = dp[i - 1][0] + maze[i][0];
        }
        for (int j = 1; j < colCount; j++) {
            dp[0][j] = dp[0][j - 1] + maze[0][j];
        }
        for (int i = 1; i < rowCount; i++) {
            for (int j = 1; j < colCount; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + maze[i][j];
            }
        }
        bw.write(String.valueOf(dp[rowCount - 1][colCount - 1]));
        bw.flush();

        br.close();
        bw.close();
    }
}
