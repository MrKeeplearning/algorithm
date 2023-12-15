package programmers.lv2.lessons12909;

import java.util.Stack;

/**
 * Stack을 사용하는 방식
 */
class Solution3 {
    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();
        char openBracket = '(';
        char closeBracket = ')';

        for (char c : s.toCharArray()) {
            if (c == openBracket) {
                stack.push(c);
            } else if (!stack.isEmpty() && stack.peek() == openBracket) {
                stack.pop();
            } else {
                return false;
            }
        }
        // 모든 문자를 검사한 뒤 stack이 비어 있으면 입력 문자열의 괄호가 모두 올바르게 닫혔다는 뜻
        return stack.isEmpty();
    }
}
