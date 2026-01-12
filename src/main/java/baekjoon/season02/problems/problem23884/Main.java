package baekjoon.season02.problems.problem23884;

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

        int[] A = new int[N];
        int[] sortedA = new int[N];
        Map<Integer, Integer> positionMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            sortedA[i] = A[i];
            positionMap.put(A[i], i);
        }

        Arrays.sort(sortedA);

        int swapped = 0;
        for (int last = N - 1; last > 0; last--) {
            int targetValue = sortedA[last];

            // 만약 배열A의 현재 위치의 값이 최대값이 아니라면 swap을 진행한다.
            if (A[last] != targetValue) {
                int currentValue = A[last];
                int targetIndex = positionMap.get(targetValue);

                swap(A, last, targetIndex);
                positionMap.put(currentValue, targetIndex);
                positionMap.put(targetValue, last);
                swapped++;

                if (swapped == K) {
                    bw.write(printArray(A));
                    bw.flush();
                    return;
                }
            }
        }

        bw.write("-1");
        bw.flush();

        br.close();
        bw.close();
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
