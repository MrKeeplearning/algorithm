package baekjoon.season01.problems.problem2869;

import java.io.*;
import java.util.*;

public class Main {

    /**
     * 달팽이가 정상에 도달하는 날을 계산할 때, 하루에 올라가는 실제 높이는 a-b
     * 다만 마지막 날에는 밤에 미끄러지지 않기 때문에 마지막 날까지 올라가면 미끄러지지 않고 종료할 수 있다.
     *
     * 이 점을 고려하여 v를 a-b 로 나눈 값을 구하는 것이 핵심
     *
     * 1. 정상에 도달하기 위해 필요한 전체 높이 : v-b (마지막 날에는 미끄러지지 않기 때문에 미리 b를 뺀다)
     * 2. 하루에 올라갈 수 있는 순수 높이 : a-b
     * 3. 필요한 일수 : (v-b) / (a-b)
     *
     * 하지만, v-b가 a-b로 나누어 떨어지지 않을 경우, 하루가 더 필요하므로 올림 계산을 해주어야 한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int day = (v - b) / (a - b);
        if ((v - b) % (a - b) != 0) {
            day++;
        }
        bw.write(String.valueOf(day));
        bw.flush();

        br.close();
        bw.close();
    }
}
