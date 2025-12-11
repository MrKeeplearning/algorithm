package baekjoon.season01.problem9506;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            String line = perfectNumber(n);
            bw.write(line);
            bw.newLine();
        }
        bw.flush();

        br.close();
        bw.close();
    }

    public static String perfectNumber(int n) {
        int sum = 0;
        StringBuilder partOfAnswer = new StringBuilder();
        ArrayList<Integer> aliquots = new ArrayList<>();

        for (int i = 1; i <= n / 2; i++) {  // 1부터 n/2까지의 약수를 찾음
            if (n % i == 0) {
                aliquots.add(i);
                sum += i;
            }
        }

        if (sum == n) {  // 완전수인 경우
            partOfAnswer.append(n).append(" = ");
            for (int i = 0; i < aliquots.size(); i++) {
                if (i > 0) {
                    partOfAnswer.append(" + ");
                }
                partOfAnswer.append(aliquots.get(i));
            }
            return partOfAnswer.toString();
        } else {
            return n + " is NOT perfect.";
        }
    }
}
