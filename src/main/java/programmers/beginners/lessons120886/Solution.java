package programmers.beginners.lessons120886;

import java.util.Arrays;

public class Solution {
    /**
     * 문제를 완전히 잘못 이해하고 있어서 틀렸음.
     * 처음 내가 생각했던 것은 before를 반전시켰을 때
     * after와 일치하면 1을 반환하는 것이라고 생각했음.
     * 그런데, 이것이 아니라 before의 순서를 어떻게든 바꿔서
     * after와 같은 문자열을 만들 수 있다면 result는 1이
     * 되는 것이다.
     */
    public int solution(String before, String after) {
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();

        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);

        if (Arrays.equals(beforeArray, afterArray)) {
            return 1;
        } else {
            return 0;
        }
    }
}
