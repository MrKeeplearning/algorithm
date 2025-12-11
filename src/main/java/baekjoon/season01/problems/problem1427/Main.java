package baekjoon.season01.problems.problem1427;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] numbers = br.readLine().toCharArray();
        Arrays.sort(numbers);

        for (int i = numbers.length - 1; i >= 0 ; i--) {
            bw.write(String.valueOf(numbers[i]));
        }

        br.close();
        bw.close();
    }
}
