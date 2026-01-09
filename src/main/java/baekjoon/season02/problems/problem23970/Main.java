package baekjoon.season02.problems.problem23970;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        BubbleSortTracker tracker = new BubbleSortTracker(A, B, N);

        if (tracker.isMatched()) {
            bw.write("1");
        } else if (tracker.runBubbleSortAndCheck()) {
            bw.write("1");
        } else {
            bw.write("0");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}

class BubbleSortTracker {
    private final int[] A;
    private final int[] B;
    private final int N;
    private int diffCount;

    BubbleSortTracker(int[] a, int[] b, int n) {
        this.A = a;
        this.B = b;
        this.N = n;
        this.diffCount = calculateInitialDiff();
    }

    private int calculateInitialDiff() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) count++;
        }
        return count;
    }

    public boolean isMatched() {
        return diffCount == 0;
    }

    /**
     * 버블 정렬을 수행하며 중간에 B와 일치하는지 확인한다.
     * @return 정렬 과정 중 B와 일치하는 순간이 있으면 true
     */
    public boolean runBubbleSortAndCheck() {
        for (int i = N - 1; i > 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (A[j] > A[j + 1]) {
                    performSwapWithDiffTracking(j, j + 1);
                    swapped = true;

                    if (isMatched()) return true;
                }
            }

            // 조기 종료 최적화: 버블 정렬의 특성상 i번째 자리는 확정됨(우측 끝에는 항상 최대값이 담기게 됨)
            // 확정된 자리가 B와 다르다면 앞으로 절대 같아질 수 없음.
            if (A[i] != B[i]) return false;

            // 배열 A가 이미 정렬된 상태 -> 더 이상 진행할 필요 없음.
            if (!swapped) break;
        }
        return false;
    }

    private void performSwapWithDiffTracking(int idx1, int idx2) {
        // swap 전 상태 확인
        updateDiffCountBeforeSwap(idx1);
        updateDiffCountBeforeSwap(idx2);

        // swap 진행
        int temp = A[idx1];
        A[idx1] = A[idx2];
        A[idx2] = temp;

        // swap 후 상태 반영
        updateDiffCountAfterSwap(idx1);
        updateDiffCountAfterSwap(idx2);
    }

    /**
     * 값이 바뀌기 전 A[idx] 와 B[idx] 가 달랐다면 이미 diffCount에 초기에 반영되어 있던 것이므로 -1을 수행
     * 값이 바뀔 예정이므로 현재 칸의 "다름 상태"를 초기화하는 것
     */
    private void updateDiffCountBeforeSwap(int idx) {
        if (A[idx] != B[idx]) diffCount--;
    }

    /**
     * 값을 바꾼 뒤 다시 비교했을 때 A[idx] 와 B[idx] 가 다르면 diffCount에 +1을 수행
     * 만약 둘이 같다면 아무 것도 하지 않음(앞서 1을 뺀 덕분에 전체 diffCount가 줄어든 효과)
     */
    private void updateDiffCountAfterSwap(int idx) {
        if (A[idx] != B[idx]) diffCount++;
    }

}
