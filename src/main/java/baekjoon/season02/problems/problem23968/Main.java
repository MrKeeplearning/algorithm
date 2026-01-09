package baekjoon.season02.problems.problem23968;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 배열 A의 크기
        int K = Integer.parseInt(st.nextToken());   // 교환 횟수

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        String answer = bubbleSort(A, N, K);
        bw.write(answer);
        bw.flush();

        br.close();
        bw.close();
    }

    private static String bubbleSort(int[] A, int N, int K) {
        String result;
        int swapped = 0;

        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (A[j] > A[j + 1]) {
                    swap(A, j, j + 1);
                    swapped++;

                    // K번째 교환인 경우
                    if (swapped == K) {
                        result = A[j] + " " + A[j + 1];
                        return result;
                    }
                }
            }
        }

        // 교환 횟수가 K번째까지 도달하지 못한 경우
        return "-1";
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
