package programmers.lv2.lessons42626;

import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int number : scoville) {
            queue.offer(number);
        }

        // 큐가 비어 있지 않은 경우에만 peek() 메서드를 호출하도록 수정
        while (!queue.isEmpty() && queue.peek() < K) {
            if (queue.size() < 2) {
                return -1;
            }
            int newScoville = queue.poll() + queue.poll() * 2;
            queue.offer(newScoville);
            count++;
        }
        return count;
    }
}
