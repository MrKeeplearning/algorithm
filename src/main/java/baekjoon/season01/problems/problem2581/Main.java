package baekjoon.season01.problems.problem2581;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        if (primeNumbers.isEmpty()) {
            bw.write(String.valueOf(-1));
        } else {
            for (Integer primeNumber : primeNumbers) {
                sum += primeNumber;
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(primeNumbers.get(0)));
        }
        bw.flush();

        br.close();
        bw.close();
    }

    public static boolean isPrime(int targetNumber) {
        if (targetNumber == 1) {
            return false;
        }
        for (int i = 2; i * i <= targetNumber; i++) {
            if (targetNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}