package dsa.ch02_arrays.Sec04InsertionSort;

import java.io.*;
import java.util.*;

// 입력:
// 5
// 2 1 5 4 3

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 횟수
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        // 입력 받은 배열
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 삽입 정렬
        insertionSort(arr);
        bw.write(Arrays.toString(arr));
        bw.flush();

        br.close();
        bw.close();
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                // Solution2와 달리 루프를 끝까지 돌면서 비교를 계속함.
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
