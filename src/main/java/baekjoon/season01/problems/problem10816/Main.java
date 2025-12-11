package baekjoon.season01.problems.problem10816;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> sgMap = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st1.nextToken());
            sgMap.put(number, sgMap.getOrDefault(number, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int targetNumber = Integer.parseInt(st2.nextToken());
            if (sgMap.containsKey(targetNumber)) {
                int targetCount = sgMap.get(targetNumber);
                sb.append(targetCount).append(" ");
            } else {
                sb.append("0").append(" ");
            }
        }
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
