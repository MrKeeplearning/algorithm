package baekjoon.season02.problems.problem23881;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String result = selectionSort(arr, N, K);
        bw.write(result);
        bw.flush();

        br.close();
        bw.close();
    }

    private static String selectionSort(int[] arr, int N, int K) {
        int swapped = 0;

        for (int last = N - 1; last > 0; last--) {
            int maxIdx = last;

            for (int i = 0; i < last; i++) {
                if (arr[i] > arr[maxIdx]) {
                    maxIdx = i;
                }
            }

            // maxIdx가 새롭게 갱신이 되지 않은 상태라면 swap하지 않는다.
            if (maxIdx != last) {
                swap(arr, maxIdx, last);
                swapped++;

                if (swapped == K) {
                    return arr[maxIdx] + " " + arr[last];
                }
            }
        }
        return "-1";
    }

    private static void swap(int[] arr, int maxIdx, int last) {
        int temp = arr[maxIdx];
        arr[maxIdx] = arr[last];
        arr[last] = temp;
    }
}
