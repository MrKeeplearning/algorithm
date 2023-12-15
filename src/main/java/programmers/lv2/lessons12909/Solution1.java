package programmers.lv2.lessons12909;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

/**
 * stack으로 풀었을 때는 실패했는데 deque으로만 교체했을 때는 통과했음.
 */
class Solution1 {
    boolean solution(String s) {

        Deque<Character> deque = new ArrayDeque<>();
        HashMap<Character, Character> parenthesisMap = new HashMap<>();
        parenthesisMap.put(')', '(');

        for (char c : s.toCharArray()) {
            if (!parenthesisMap.containsKey(c)) {
                deque.push(c);
            } else {
                if (deque.isEmpty() || parenthesisMap.get(c) != deque.pop()) {
                    return false;
                }
            }
        }
        // 모든 문자를 검사한 뒤 stack이 비어 있으면 입력 문자열의 괄호가 모두 올바르게 닫혔다는 뜻
        return deque.isEmpty();
    }
}
