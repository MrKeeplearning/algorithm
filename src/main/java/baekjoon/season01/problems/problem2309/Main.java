package baekjoon.season01.problems.problem2309;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] heights = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            sum += heights[i];
        }

        Arrays.sort(heights);

        boolean found = false;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                // 아홉 난쟁이 중 2명을 선택하고 이들의 합을 전체 합에서 빼서 100이 되는지 확인한다.
                // 값이 만약 100이라면 두 난쟁이를 제외한 나머지를 출력하고 프로그램을 종료한다.
                if (sum - heights[i] - heights[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) {
                            continue;
                        }
                        bw.write(String.valueOf(heights[k]));
                        bw.newLine();
                    }
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        br.close();
        bw.close();
    }
}
