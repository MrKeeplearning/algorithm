package baekjoon.problem1057;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int lim = Integer.parseInt(st.nextToken());

        int round = 0;

        // 김지민과 임한수가 같은 라운드에서 만날 때까지 반복한다.
        while (kim != lim) {
            round++;
            // 라운드마다 번호는 갱신된다.
            kim = (kim + 1) / 2;
            lim = (lim + 1) / 2;
        }

        // 결과 출력
        bw.write(String.valueOf(round));
        bw.newLine();

        br.close();
        bw.close();
    }
}
