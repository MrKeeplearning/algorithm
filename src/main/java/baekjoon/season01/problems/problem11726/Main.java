package baekjoon.season01.problems.problem11726;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // n이 1일 때부터 사용된 타일의 개수를 확인해보면
        // dp[n] = dp[n - 1] + dp[n - 2] 라는 점화식이 나온다는 것을 확인할 수 있다.
        // 모두 더한 뒤, 더한 값에 대해서 모듈로 연산을 취하면 오버플로우가 발생하기 때문에
        // 배열에 담을 때부터 모듈로 연산을 한 결과를 담아야 한다.
        // long 타입으로 바꿔도 동일하게 오버플로우가 발생함.
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[(2 * n) + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        bw.write(String.valueOf(dp[n]));

        br.close();
        bw.close();
    }
}
