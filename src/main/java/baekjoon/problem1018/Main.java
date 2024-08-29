package baekjoon.problem1018;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 행의 개수
        int M = Integer.parseInt(st.nextToken()); // 열의 개수
        String[] board = new String[N];// 주어진 원본 보드

        // 보드 채우기
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine();
        }

        // 접근법의 Step 1 파트와 대응된다.
        int minRepaints = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                // 각 위치에서 8 x 8 체스판 확인
                minRepaints = Math.min(minRepaints, calculateRepaints(board, i, j));
            }
        }

        bw.write(minRepaints + "\n");

        br.close();
        bw.close();
    }

    private static int calculateRepaints(String[] board, int startRow, int startCol) {
        String[] boardType = {"WBWBWBWB", "BWBWBWBW"};
        int repaints = 0;

        // 매개변수로 받은 시작점에서부터 체스판을 확인하며 다시 칠해야 할 칸의 개수를 확인한다.
        for (int i = 0; i < 8; i++) {
            int row = startRow + i;
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;
                // 모듈로 연산을 통해서 WB로 시작하는 행에서 비교를 했다면
                // 다음 비교는 BW로 시작하는 행에서 비교를 할 수 있도록 한다.
                if (board[row].charAt(col) != boardType[row % 2].charAt(j)) {
                    // boardType에 대해서 charAt에 charAt(j)가 아닌 charAt(col)을 하면 틀린다.
                    // 처음 입력 받은 board에 대해서 charAt(col)을 하는 것과
                    // 변하지 않는 boardType의 값을 기준으로 인덱스를 비교하는 것은
                    // charAt에 들어갈 인덱스의 값이 달라야 한다.
                    repaints++;
                }
            }
        }
        // [Step 2에서 다룬 규칙]
        // 체스판의 최상단 row가 bw로 시작하는 타입일 때 다시 칠해야 하는 타일의 최소 개수가 x개라면
        // wb로 시작하는 타입에서 다시 칠해야 하는 타일의 최소 개수는 (전체 체스판의 타일 개수) - x 개가 된다.
        // 따라서 이렇게 2개 타입의 체스판 중 최소로 칠해야 하는 개수가 나오는 것을 선택할 수 있도록 한다.
        return Math.min(repaints, 64 - repaints);
    }
}
