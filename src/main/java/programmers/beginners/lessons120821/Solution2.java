package programmers.beginners.lessons120821;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * ArrayDeque를 사용하는 방법
 * - 추가적인 메모리를 사용한다.
 * - 원본 배열의 순서를 변경하지 않고 코드 부분이 간결해진다.
 */
public class Solution2 {
    public static int[] solution(int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();

        // deque의 앞에서부터 값을 넣기 때문에 deque에는 뒤집한 순서로 저장된다.
        for (int num : arr) {
            deque.addFirst(num);
        }

        // deque의 앞에서부터 값을 빼서 reversed에 삽입하기 때문에
        // deque에 저장된 순서 그대로 reversed에 들어가게 된다.
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = deque.removeFirst();
        }

        return reversed;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1, 1, 3, 5};
        array = solution(array);
        System.out.println(Arrays.toString(array));
    }
}