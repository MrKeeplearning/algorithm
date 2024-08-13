package baekjoon.problem11005;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        String converted = base(N, B);
        bw.write(converted);

        br.close();
        bw.close();
    }

    public static String base(int n, int base) {
        StringBuilder sb = new StringBuilder();

        if (n == 0) {
            return "0";
        }

        while (n > 0) {
            int remainder = n % base;
            if (remainder < 10) {
                sb.insert(0, remainder);  // 숫자는 그대로 추가
            } else {
                sb.insert(0, (char) ('A' + remainder - 10));  // 10 이상의 값은 A-Z로 변환
            }
            n = n / base;
        }

        return sb.toString();
    }
}
