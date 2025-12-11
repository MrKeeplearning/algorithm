package baekjoon.season01.problems.problem20529;

import java.io.*;

public class Main {
    static int N;
    static String[] mbti;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        

        br.close();
        bw.close();
    }

    public static int getDistance(String mbti1, String mbti2) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (mbti1.charAt(i) != mbti2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
