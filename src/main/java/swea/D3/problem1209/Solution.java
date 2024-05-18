package swea.D3.problem1209;

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int test_case = 1; test_case <= 10; test_case++) {
            int T = Integer.parseInt(br.readLine());  // 테스트케이스 번호
            int[][] array = new int[100][100];

            // 배열에 값 채우기
            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    array[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 행과 열 중 최대값 구하기
            int max = Integer.MIN_VALUE;
            int sum;
            for (int i = 0; i < 100; i++) {
                int sumRow = 0;
                int sumColumn = 0;
                for (int j = 0; j < 100; j++) {
                    sumRow += array[i][j];
                    sumColumn += array[j][i];
                }
                max = Math.max(max, Math.max(sumRow, sumColumn));
            }

            // 대각선까지 고려해서 전체 최대값 구하기
            int sumDiagonal1 = 0;
            int sumDiagonal2 = 0;
            for (int i = 0; i < 100; i++) {
                sumDiagonal1 += array[i][i];
                sumDiagonal2 += array[i][99 - i];
            }
            max = Math.max(max, Math.max(sumDiagonal1, sumDiagonal2));

            StringBuilder sb = new StringBuilder();
            sb.append("#").append(T).append(" ").append(max).append("\n");
            bw.write(sb.toString());
            bw.flush();
        }
        br.close();
        bw.close();
    }
}