package programmers.beginners.lessons120906;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(1234 % 10);  // 4
        System.out.println(1234 / 10);  // 123
    }
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}