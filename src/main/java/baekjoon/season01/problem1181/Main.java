package baekjoon.season01.problem1181;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>(Comparator.comparingInt(String::length)
                .thenComparing(String::compareTo));
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        // String을 길이에 따라 먼저 정렬한다.
        // 같은 길이를 가진 String은 사전 순으로 정렬한다.
        for (String word : set) {
            bw.write(word);
            bw.newLine();
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
