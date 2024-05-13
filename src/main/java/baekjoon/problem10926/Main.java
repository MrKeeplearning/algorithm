package baekjoon.problem10926;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        sb.append(input);
        sb.append("??!");
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
