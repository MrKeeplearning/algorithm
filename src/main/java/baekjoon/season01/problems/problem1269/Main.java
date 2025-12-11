package baekjoon.season01.problems.problem1269;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[100000001];
        int count = 0;

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int sizeOfA = Integer.parseInt(st1.nextToken());
        int sizeOfB = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeOfA; i++) {
            numbers[Integer.parseInt(st2.nextToken())]++;
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeOfB; i++) {
            numbers[Integer.parseInt(st3.nextToken())]++;
        }

        for (int number : numbers) {
            if (number == 1) {
                count++;
            }
        }
        bw.write(String.valueOf(count));

        br.close();
        bw.close();
    }
}
