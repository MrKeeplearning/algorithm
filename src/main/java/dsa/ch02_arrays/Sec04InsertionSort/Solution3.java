package dsa.ch02_arrays.Sec04InsertionSort;

import java.io.*;
import java.util.*;

public class Solution3 {
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

    // Shift 기반 삽입 정렬로 더욱 최적화
    // - swap은 3번 대입과 함수호출로 비용이 큼
    // - shift 기반은 대부분 단순 대입(arr[j+1] = arr[j])만 반복
    // - 거의 정렬된 데이터에서는 while이 거의 안 돌고 끝나서 매우 빠름
    private static void insertionSort(int[] arr, int N) {
        for (int i = 1; i < N; i++) {
            int key = arr[i];   // 삽입할 값 보관
            int j = i - 1;

            // key보다 큰 값은 오른쪽으로 한 칸씩 밀어낸다.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // j가 멈춘 지점의 바로 오른쪽(j+1)이 key가 들어갈 자리
            arr[j + 1] = key;
        }
    }
}
