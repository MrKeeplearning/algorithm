package dsa.ch02_arrays.BubbleSort;

import java.io.*;
import java.util.*;

/**
 * 버블정렬
 * 1. 배열의 값을 하나씩 순회
 * 2. 각 값에 대해, 해당 값을 다음 값과 비교
 * 3. 현재의 값이 다음 값보다 크다면 두 값을 교환하여 가장 큰 값이 마지막에 올 수 있도록 처리
 * 4. 배열에 담긴 값의 개수만큼 배열을 순회한다.
 */
public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {64, 34, 25, 12, 22, 11, 90, 5};

        for (int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        bw.write(Arrays.toString(arr));
        bw.flush();

        br.close();
        bw.close();
    }
}
