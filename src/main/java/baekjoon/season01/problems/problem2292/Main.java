package baekjoon.season01.problems.problem2292;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 방의 개수는 등차수열의 형태로 증가함
        // 한 바퀴씩 증가할 때마다 6의 배수만큼 더해주어 범위를 확장하면 됨.

        int n = Integer.parseInt(br.readLine());

        int count = 1;  // 지나가야 하는 방의 개수
        int temp = 1;   // 해당 범위의 최대값(둘러싸고 있는 한바퀴 내에서 가장 큰 수)

        while (true) {
            // 입력한 수가 범위 이하라면 반복을 종료한다.
            if (n <= temp) break;

            // 범위 이하에 속하지 않는다면 범위를 늘려 최대값을 구하고 최대값 이하에 속하는지 확인한다.
            temp = temp + (6 * count);
            count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();

        br.close();
        bw.close();
    }
}
