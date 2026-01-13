package dsa.ch02_arrays.Sec02BubbleSort;

import java.io.*;
import java.util.*;

/**
 * BubbleSort 최적화
 * - 마지막으로 앞뒤자리 비교가 있던 index를 기억해두면 다음 순회에서는 해당 index 전까지만 정렬하면 된다.
 * - 따라서 한 칸 씩 정렬 범위를 줄여나가는 대신, 한번에 여러 칸씩 정렬 범위를 줄여나갈 수 있다.
 */
public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {64, 34, 25, 12, 22, 11, 90, 5};
        bubbleSort(arr);
        bw.write(Arrays.toString(arr));
        bw.flush();

        bw.close();
    }

    private static void bubbleSort(int[] arr) {
        int end = arr.length - 1;
        while (end > 0) {
            int lastSwapIdx = 0;
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    lastSwapIdx = i;
                }
            }
            end = lastSwapIdx;
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
