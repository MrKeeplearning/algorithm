package baekjoon.season01.problems.problem10157;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());   // 공연장 가로 길이 (column 개수)
        int R = Integer.parseInt(st.nextToken());   // 공연장 세로 길이 (row 개수)
        int K = Integer.parseInt(br.readLine());    // 특정 관객의 대기 번호

        // 모든 좌석이 배정되어 해당 대기번호의 관객에게 좌석을 배정할 수 없는 경우 0을 출력한다.
        if (K > C*R) {
            bw.write("0");
            bw.flush();
            return;
        }

        int[] dx = {0, 1, 0, -1};   // 우, 하, 좌, 상
        int[] dy = {1, 0, -1, 0};

        // C x R 사이즈의 배열 테두리를 -1로 감싸기 위해서 배열의 사이즈를 늘림
        int[][] arr = new int[C + 2][R + 2];

        // 양사이드 컬럼 -1로 채우기
        for (int i = 0; i < (C + 2); i++) {
            arr[i][0] = -1;
            arr[i][R + 1] = -1;
        }

        // 최상단과 최하단의 row -1로 채우기
        for (int i = 0; i < (R + 2); i++) {
            arr[0][i] = -1;
            arr[C + 1][i] = -1;
        }

        int count = 1;  // 대기번호 1부터 시작
        int direction = 0;  // 현재 방향을 나타내는 변수 (0:우, 1:하, 2:좌, 3:상)
        int x = 1, y = 1;   // (x, y)는 (1, 1)부터 시작

        while (count <= K) {
            // 만약 다음 위치가 비어있다면 이동한다.
            if (arr[x + dx[direction]][y + dy[direction]] == 0) {
                x += dx[direction];
                y += dy[direction];
                arr[x][y] = count++;
            } else {
                // 다음 위치가 비어있지 않다면 방향을 바꾼다.
                direction = (direction + 1) % 4;
            }
        }

        bw.write(x + " " + y);
        bw.flush();

        br.close();
        bw.close();
    }
}
