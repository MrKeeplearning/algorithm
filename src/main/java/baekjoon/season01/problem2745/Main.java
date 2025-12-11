package baekjoon.season01.problem2745;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int answer = 0;

        for (int i = 0; i < N.length(); i++) {
            int above10 = N.charAt(i) - 'A' + 10;
            int under10 = Character.getNumericValue(N.charAt(i));
            if (above10 >= 10) {
                answer += (int) (above10 * (Math.pow(B, N.length() - i - 1)));
            } else {
                answer += (int) (under10 * (Math.pow(B, N.length() - i - 1)));
            }
        }

        bw.write(answer + "\n");
        br.close();
        bw.close();
    }
}
