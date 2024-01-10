package programmers.lv3.lessons42628;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {

    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {
            StringTokenizer st = new StringTokenizer(operation);
            String operator = st.nextToken();
            String number = st.nextToken();

            if (operator.equals("I")) {
                minHeap.offer(Integer.parseInt(number));
                maxHeap.offer(Integer.parseInt(number));

            } else if (operator.equals("D") && number.equals("1") && !minHeap.isEmpty()) {
                // 최댓값 삭제
                Integer maxValue = maxHeap.poll();
                minHeap.remove(maxValue);
            } else if (operator.equals("D") && number.equals("-1") && !minHeap.isEmpty()) {
                // 최솟값 삭제
                Integer minValue = minHeap.poll();
                maxHeap.remove(minValue);
            }
        }

        if (!minHeap.isEmpty()) {
            answer[0] = maxHeap.poll();
            answer[1] = minHeap.poll();
        }
        return answer;
    }
}