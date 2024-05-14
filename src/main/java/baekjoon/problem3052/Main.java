package baekjoon.problem3052;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<Integer> uniqueRemainder = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            uniqueRemainder.add(num % 42);
        }

        bw.write(String.valueOf(uniqueRemainder.size()));

        br.close();
        bw.close();
    }
}
