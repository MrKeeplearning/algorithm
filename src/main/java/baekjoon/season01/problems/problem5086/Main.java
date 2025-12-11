package baekjoon.season01.problems.problem5086;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String answer;

        while (true) {
            String inputLine = br.readLine();
            if (inputLine.equals("0 0")) break;

            StringTokenizer st = new StringTokenizer(inputLine);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 첫 번째 숫자가 두 번째 숫자의 약수
            if (b % a == 0) {
                answer = "factor";
            }
            // 첫 번째 숫자가 두 번째 숫자의 배수
            else if (a % b == 0) {
                answer = "multiple";
            } else {
                answer = "neither";
            }

            bw.write(answer + "\n");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
