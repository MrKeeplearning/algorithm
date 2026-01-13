package baekjoon.season02.problems.problem24051;

import java.io.*;
import java.util.*;

public class Main {

    static int count = 0;
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        String answer = insertionSort(A, N, K);
        bw.write(answer);
        bw.flush();

        br.close();
        bw.close();
    }

    private static String insertionSort(int[] A, int N, int K) {
        String kthValue = "";

        for (int i = 1; i < N; i++) {
            int key = A[i]; // 삽입할 값을 보관
            int j = i - 1;

            // key보다 큰 값은 오른쪽으로 한 칸씩 밀어낸다.
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;

                count++;
                if (count == K) {
                    kthValue = String.valueOf(A[j + 1]);
                    return kthValue;
                }
            }

            // 원래 자리(i)와 최종 위치(j + 1)가 다를 때만 저장 연산을 수행한다.
            if (j + 1 != i) {
                // j가 멈춘 지점의 바로 오른쪽(j+1)이 key가 들어갈 자리
                A[j + 1] = key;
                count++;
                if (count == K) {
                    kthValue = String.valueOf(A[j + 1]);
                    return kthValue;
                }
            }
        }

        kthValue = "-1";
        return kthValue;
    }
}
