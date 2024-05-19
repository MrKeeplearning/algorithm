package baekjoon.problem1417;

import java.io.*;
import java.util.*;

/**
 * 우선순위 큐를 사용해서 최적화한 풀이.
 * PQ는 내부적으로 힙을 이용해서 항상 정렬된 상태를 유지하기 때문에 최대값을 찾는데 상수 시간이 소요된다.
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int myVotes = Integer.parseInt(br.readLine());  // 기호 1번 득표수

        if (N == 1) {
            bw.write("0");
            bw.flush();
            return;
        }

        // 최대 투표 수만을 찾으면 되기 때문에 자료구조인 우선순위 큐를 사용해서 최적화하는 것이 가능하다.
        // 가장 투표 수가 많은 후보를 빼고 그 수를 현재 최대값으로 지정.
        // 다솜이의 투표를 1증가시킨 뒤, 앞서 뽑은 최대값에서 1을 뺀 값을 다시 우선순위 큐에 삽입.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N-1; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        while (myVotes <= pq.peek()) {
            int currentMax = pq.poll();
            myVotes++;
            count++;
            pq.offer(currentMax - 1);
        }

        bw.write(String.valueOf(count));
        bw.flush();

        br.close();
        bw.close();
    }
}
