package baekjoon.problem2739;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        for (int i = 1; i < 10; i++) {
            bw.write(number + " * " + i + " = " + (number * i) + "\n");
        }

        br.close();
        bw.close();
    }
}
