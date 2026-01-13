package dsa.ch02_arrays.Sec01Arrays;

import java.io.*;

/**
 * Algorithm: Find the lowest value in an array.
 */
public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 기본 배열 생성
        int[] arr = {7, 12, 9, 4, 11};
        int min = arr[0];

        // 2. 배열을 첫번째 인덱스부터 순회하며 최소값 발견 시 최소값 갱신
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        // 3. 순회를 마쳤다면 저장된 최소값이 최종 결과
        bw.write(min + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
