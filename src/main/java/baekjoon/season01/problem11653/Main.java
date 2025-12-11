package baekjoon.season01.problem11653;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 정수 N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다.
        // N이 1인 경우 아무것도 출력하지 않는다.
        for (int i = 2; i <= N; i++) {
            // 현재의 i가 N의 인수인지 확인한다. 즉, N이 i로 나누어 떨어지면, i를 출력하고 N을 i로 나눈 몫으로 갱신한다.
            // 예를 들어, N = 64이고 i = 2라면 N % 2 == 0이 참이므로 bw.write(2)가 실행되고 N이 N/2로 갱신된다.
            // 이 과정이 N%i가 0이 될 때까지 반복된다.
            // while 루프 안에서 N을 갱신하여 N이 1이 되는 순간이 오면 더 이상 나누어지지 않기 때문에 for문도 종료된다.
            while (N % i == 0) {
                bw.write(i + "\n");
                N /= i;
            }
        }

        br.close();
        bw.close();
    }
}
