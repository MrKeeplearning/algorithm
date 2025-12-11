package baekjoon.season01.problem14681;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        bw.write(whichQuadrant(x, y));

        br.close();
        bw.close();
    }

    public static String whichQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return "1";
        } else if (x < 0 && y > 0) {
            return "2";
        } else if (x < 0 && y < 0) {
            return "3";
        } else if (x > 0 && y < 0) {
            return "4";
        } else {
            return "0";
        }
    }
}
