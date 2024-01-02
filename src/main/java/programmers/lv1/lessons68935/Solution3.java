package programmers.lv1.lessons68935;

public class Solution3 {
    public int solution(int n) {
        // 숫자를 3진법 문자열로 변환
        String ternary = Integer.toString(n, 3);
        String reversed = new StringBuilder(ternary).reverse().toString();
        // 10진수로 변환
        return Integer.parseInt(reversed, 3);
    }
}
