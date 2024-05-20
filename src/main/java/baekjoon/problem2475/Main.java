package baekjoon.problem2475;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            sum += Math.pow(Double.parseDouble(st.nextToken()), 2);
        }
        int result = (int)sum % 10;

        bw.write(String.valueOf(result));
        bw.flush();

        br.close();
        bw.close();
    }
}
