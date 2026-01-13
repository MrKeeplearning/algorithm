package dsa.ch02_arrays.Sec04InsertionSort;

import java.io.*;
import java.util.*;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 받은 배열의 길이
        int N = Integer.parseInt(br.readLine());

        // 입력 받은 배열의 값으로 배열 생성
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        insertionSort(arr, N);
        bw.write(Arrays.toString(arr));
        bw.flush();

        br.close();
        bw.close();
    }

    private static void insertionSort(int[] arr, int N) {
        for (int i = 1; i < N; i++) {
            int j = i;
            // Solution1과 달리 기존에 정렬이 된 지점까지 도달하면 더 이상 비교를 하지 않음.
            while(j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j - 1, j);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
