package dsa.ch02_arrays.BubbleSort;

import java.io.*;
import java.util.*;

/**
 * BubbleSort 최적화
 * : 직전 순회에서 swap이 발생하지 않았다면, 더 이상 swap을 진행하지 않고 멈춘다.
 */
public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {64, 34, 25, 12, 22, 11, 90, 5};
        for (int i = arr.length - 1; i > 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        bw.write(Arrays.toString(arr));
        bw.flush();

        br.close();
        bw.close();
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
