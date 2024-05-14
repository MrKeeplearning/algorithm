package baekjoon.problem5597;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[31];
        for (int i = 0; i < 28; i++) {
            int submit = Integer.parseInt(br.readLine());
            // 제출한 사람은 true로 체크.
            arr[submit] = true;
        }

        // 미제출자만 골라내기
        for (int i = 1; i <= 30; i++) {
            if (!arr[i]) {
                bw.write(i);
                bw.newLine();
            }
        }

        br.close();
        bw.close();
    }
}
