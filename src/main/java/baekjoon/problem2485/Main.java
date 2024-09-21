package baekjoon.problem2485;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] trees = new int[n];

        // 나무 위치 입력
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        // 각 나무 간의 간격 저장
        int[] gaps = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            gaps[i] = trees[i + 1] - trees[i];
        }

        // 모든 간격의 최대 공약수 구하기
        int gcd = gaps[0];
        for (int i = 1; i < gaps.length; i++) {
            gcd = gcd(gcd, gaps[i]);
        }

        // 필요한 나무의 수 계산하기
        int result = 0;
        for (int gap : gaps) {
            result += (gap / gcd) - 1;
        }

        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }

    // 최대공약수를 구하는 유클리드 호제법
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
