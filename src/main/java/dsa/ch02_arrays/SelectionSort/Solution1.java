package dsa.ch02_arrays.SelectionSort;

import java.io.*;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {64, 34, 25, 5, 22, 11, 90, 12};
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // minIdx가 새롭게 갱신이 되지 않은 상태라면 swap 안해도 됨
            if (minIdx != i) {
                int tmp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = tmp;
            }
        }

        bw.write(Arrays.toString(arr));
        bw.flush();

        br.close();
        bw.close();
    }
}
