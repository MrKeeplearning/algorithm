package baekjoon.problem2231;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            int number = i;
            int sum = 0;

            // 각 자리수 더하기
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            // 생성자를 찾은 경우
            if (sum + i == n) {
                result = i;
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();

        br.close();
        bw.close();
    }
}
