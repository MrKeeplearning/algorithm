package baekjoon.problem1058;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // (1) 사용자의 입력을 받아서 변수에 저장한다.
        int n = Integer.parseInt(br.readLine());
        char[][] friends = new char[n][n];
        for (int i = 0; i < n; i++) {
            friends[i] = br.readLine().toCharArray();
        }

        // (2) 두 사람이 2-친구인지 저장하는 2차원 배열을 생성한다.
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || friends[i][j] == 'Y') {
                    dist[i][j] = 1;
                } else {
                    // 아직 친구가 아닌 사람은 거리를 n으로 설정한다.
                    dist[i][j] = n;
                }
            }
        }

        br.close();
        bw.close();
    }
}
