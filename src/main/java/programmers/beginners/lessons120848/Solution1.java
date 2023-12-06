package programmers.beginners.lessons120848;

public class Solution1 {

    public static void main(String[] args) {
        int answer = solution(7);
        System.out.println(answer);
    }

    public static int solution(int n) {
        int factorial = 1;
        int answer = 0;
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
            if (factorial <= n) {
                answer = i;
            }
        }
        return answer;
    }
}