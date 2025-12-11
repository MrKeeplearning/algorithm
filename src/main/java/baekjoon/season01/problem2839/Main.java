package baekjoon.season01.problem2839;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // dp[i]는 ikg을 만들기 위한 최소한의 봉지 개수를 의미.
        // 이를 N+1로 초기화해서 모든 값을 최대치로 설정해둔다.
        int[] dp = new int[N + 1];
        Arrays.fill(dp, N + 1);
        dp[0] = 0;  // 0kg을 맞추기 위해서는 봉지가 필요 없음.

        int[] bags = {3, 5};    // 사용할 수 있는 봉지 용량
        for (int i = 1; i <= N; i++) {
            for (int bag : bags) {
                if (i >= bag) {
                    dp[i] = Math.min(dp[i], dp[i - bag] + 1);
                }
            }
        }

        // dp[N]의 값이 여전히 N+1 이라면 정확히 Nkg을 만들 수 없다는 의미이므로 -1을 출력.
        if (dp[N] > N) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(dp[N]));
        }

        br.close();
        bw.close();
    }
}
