package baekjoon.problem11654;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ascii = br.read();
        bw.write(String.valueOf(ascii));

        br.close();
        bw.close();
    }
}
