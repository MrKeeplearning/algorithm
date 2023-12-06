package programmers.beginners.lessons120814;

public class Solution {
    public static void main(String[] args) {
        int solution = solution(15);
        System.out.println(solution);
    }

    public static int solution(int n) {
        int answer = 0;
        if (n % 7 != 0) {
            answer = n / 7 + 1;
        } else
            answer = n / 7;
        return answer;
    }
}
