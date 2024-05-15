package baekjoon.problem11720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        int N = Integer.parseInt(br.readLine());
        for (char c : br.readLine().toCharArray()) {
            result += Character.getNumericValue(c);
        }
        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}
