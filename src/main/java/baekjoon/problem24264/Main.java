package baekjoon.problem24264;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 이중 for문이기 때문에 바깥 for문이 n회, 내부 for문이 n회 수행하게 된다.
        // 결과적으로 반복 횟수는 n^2 회 수행하게 된다.
        // 마찬가지로 수행 횟수를 다항식으로 나타낸다면 이차식이 되기 때문에 최고 차항의 차수는 2가 된다.
        long n = Long.parseLong(br.readLine());
        long answer = n * n;
        bw.write(answer + "\n");
        bw.write("2");
        bw.flush();
        br.close();
        bw.close();
    }
}
