package baekjoon.season01.problems.problem10448;

import java.io.*;

public class Main {
    // n*(n+1)/2 공식에서 n이 44일 때 삼각수는 44 * 45 / 2 = 990이 되고,
    // n이 45일 때 삼각수는 45 * 46 / 2 = 1035가 됨.
    // 주어진 자연수 K의 범위 또한 3 <= K <= 1000 에 해당됨
    static int[] triangularNum = new int[45];
    static int[] allSums = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 삼각수를 계산해서 배열에 저장
        for (int i = 1; i < triangularNum.length; i++) {
            triangularNum[i] = i * (i + 1) / 2;
        }

        // 모든 가능한 삼각수의 합 계산
        for (int i = 1; i < triangularNum.length; i++) {
            for (int j = 1; j < triangularNum.length; j++) {
                for (int k = 1; k < triangularNum.length; k++) {
                    int sum = triangularNum[i] + triangularNum[j] + triangularNum[k];
                    if (sum <= 1000) {
                        allSums[sum] = 1;
                    }
                }
            }
        }

        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            int K = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(allSums[K]));
            bw.newLine();
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
