package baekjoon.season01.problems.problem1193;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());

        int diagonal = 1;   // 대각선 번호
        int count = 0;  // 누적 분수의 수

        // 대각선 번호를 찾는 루프
        while (count < X) {
            count += diagonal;
            diagonal++;
        }

        // 대각선 번호가 홀수인지 짝수인지 확인하기 위해 대각선 번호는 1부터 시작.
        // 루프를 마친 후 1을 빼야 정확한 대각선 번호가 된다.
        diagonal--;
        int offset = count - X; // 대각선에서 몇 번째인지 계산

        int numerator = 1 + offset;
        int denominator = diagonal - offset;

        if (diagonal % 2 == 0) {
            // 대각선 번호가 짝수일 때
            bw.write(denominator + "/" + numerator + "\n");
        } else {
            // 대각선 번호가 홀수일 때
            bw.write(numerator + "/" + denominator + "\n");
        }

        br.close();
        bw.close();
    }
}
