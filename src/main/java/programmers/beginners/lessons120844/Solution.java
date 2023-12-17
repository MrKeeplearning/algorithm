package programmers.beginners.lessons120844;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

public class Solution {
    public int[] solution(int[] numbers, String direction) {

        ArrayDeque<Integer> integers = new ArrayDeque<>();
        for (int number : numbers) {
            integers.offer(number);
        }

        if (direction.equals("left")) {
            Integer polled = integers.poll();
            integers.offer(Objects.requireNonNull(polled));
        } else if (direction.equals("right")) {
            Integer polledLast = integers.pollLast();
            integers.offerFirst(Objects.requireNonNull(polledLast));
        }

        Iterator<Integer> iterator = integers.iterator();

        int[] answer = new int[integers.size()];
        int count = 0;
        while (iterator.hasNext()) {
            answer[count++] = iterator.next();
        }

        return answer;
    }
}