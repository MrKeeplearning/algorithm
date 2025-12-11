package baekjoon.season01.problems.problem1059;

import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean endSign = false;    // endSign이 true라면 좋은 구간은 없는 것이므로 0을 결과로 출력해야 한다.
        int L = Integer.parseInt(br.readLine());    // 집합 S의 크기
        int[] numbers = new int[L];     // 집합 S의 요소를 담은 배열

        String numberLine = br.readLine();
        int n = Integer.parseInt(br.readLine());    // 타겟 넘버

        StringTokenizer st = new StringTokenizer(numberLine);
        for (int i = 0; i < L; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
            // 만약 주어진 집합 S에 n이 담겨 있다면 endSign을 true로 바꿔 추후에 0을 출력하도록 한다.
            if (numbers[i] == n) {
                endSign = true;
            }
        }

        if (!endSign) {
            int answer = goodIntervals(numbers, L, n);
            bw.write(String.valueOf(answer));
            bw.newLine();
        } else {
            bw.write("0\n");
        }

        br.close();
        bw.close();
    }

    private static int goodIntervals(int[] numbers, int L, int n){
        int L1 = 0; // 집합 S에서 n보다 작은 수 중 가장 큰 수
        int L2 = 1001; // 집합 S에서 n보다 큰 수 중 가장 작은 수
        int count = 0;

        // 집합 S 오름차순 정렬
        Arrays.sort(numbers);

        // L1 찾기
        for (int i = 0; i < L; i++) {
            if (numbers[i] < n) {
                L1 = numbers[i];
            } else {
                break;
            }
        }

        // L2 찾기
        for (int i = 0; i < L; i++) {
            if (numbers[i] > n) {
                L2 = numbers[i];
                break;
            }
        }

        // L1 + 1부터 L2 - 1까지 n을 포함하는 모든 구간의 개수 계산
        for (int i = L1 + 1; i <= n; i++) {
            for (int j = n; j < L2; j++) {
                if (i != j) {
                    count++;
                }
            }
        }

        return count;
    }
}
