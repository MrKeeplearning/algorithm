package baekjoon.problem2798;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cards = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int max = 0;
        for (int i = 0; i < n - 2; i++) {
            // 오름차순 정렬한 상태에서 첫 번째 값이 m을 3으로 나눈 몫보다 크다면 더 이상 탐색할 필요가 없다.
            if (cards[i] > (m / 3)) continue;
            for (int j = i + 1; j < n - 1; j++) {
                // 첫번째와 두번째 값의 합이 m보다 크면 더 이상 탐색할 필요가 없다.
                if (cards[i] + cards[j] > m) continue;
                for (int k = j + 1; k < n; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum == m) {
                        max = sum;
                        break;
                    }
                    // 3개 카드의 합이 이전까지의 합보다 크면서, m보다 작은 경우 max값을 갱신한다.
                    if (sum > max && sum < m) {
                        max = sum;
                    }
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();

        br.close();
        bw.close();
    }
}
