package baekjoon.problem8958;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int count = 0;
            int result = 0;

            String quiz = br.readLine();
            for (int j = 0; j < quiz.length(); j++) {
                if (quiz.charAt(j) == 'O') {
                    count++;
                    result += count;
                } else {
                    count = 0;
                }
            }
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
