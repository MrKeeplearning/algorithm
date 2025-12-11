package baekjoon.season01.problem17626;

import java.io.*;

// n이 주어지면, n보다 작거나 같은 모든 제곱수에 대해 수행해본다.
// 각 단계에서 해당 제곱수를 빼고 남은 수(n - i^2)에 대해 최소의 제곱 개수를 구하고,
// 그 중에서 가장 작은 값이 해당 수(n)의 최소 제곱수 개수가 된다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // dp에는 각 자리의 인덱스에 해당되는 숫자가 몇 개의 제곱수의 합으로 이루어질 수 있는지 숫자를 담는다.
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        // 만약 i가 25라면 다음과 같이 진행된다.
        // j = 1일 때, 25 - 1*1 = 24      dp[24]는 3
        // j = 2일 때, 25 - 2*2 = 21      dp[21]으 3
        // j = 3일 때, 25 - 3*3 = 16      dp[16]은 1
        // j = 4일 때, 25 - 4*4 = 9       dp[9]은 1
        // j = 5일 때, 25 - 5*5 = 0       dp[0]은 0
        // 최소값은 0이고, 따라서 자기자신인 5*5 1개를 더한 1이 25에 대한 최소 개수의 제곱수 개수가 된다.
        for (int i = 2; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - (j * j)]);
            }
            // 최솟값을 구했다면 j*j를 제곱수의 개수에 포함해야 하기 때문에 +1을 한다.
            dp[i]++;
        }
        bw.write(String.valueOf(dp[n]));

        br.close();
        bw.close();
    }
}
