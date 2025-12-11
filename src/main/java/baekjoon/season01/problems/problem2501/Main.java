package baekjoon.season01.problems.problem2501;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> integers = new HashSet<>();
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            if (integers.contains(i)) {
                break;
            } else if (N % i == 0) {
                integers.add(i);
                integers.add(N / i);
            }
        }

        if (integers.size() >= K) {
            ArrayList<Integer> numbers = new ArrayList<>(integers);
            Collections.sort(numbers);
            answer = numbers.get(K - 1);
        }

        bw.write(answer + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
