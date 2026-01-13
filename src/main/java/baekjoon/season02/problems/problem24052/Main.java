package baekjoon.season02.problems.problem24052;

import java.io.*;
import java.util.*;

public class Main {

    static int count = 0;
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        String answer = insertionSort(A, N, K);
        bw.write(answer);
        bw.flush();

        br.close();
        bw.close();
    }

    private static String insertionSort(int[] A, int N, int K) {
        String result;

        for (int i = 1; i < N; i++) {
            int key = A[i]; // 삽입할 값 보관
            int j = i - 1;

            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;

                count++;
                if (count == K) {
                    result = printArray(A);
                    return result;
                }
            }

            if (j + 1 != i) {
                A[j + 1] = key;

                count++;
                if (count == K) {
                    result = printArray(A);
                    return result;
                }
            }
        }

        result = "-1";
        return result;
    }

    private static String printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i);
            sb.append(" ");
        }
        return sb.toString();
    }
}
