package programmers.beginners.lessons120848;

public class Solution2 {

    public static void main(String[] args) {
        int answer = solution(7);
        System.out.println(answer);
    }

    public static int solution(int n) {
        int factorial = 1;
        int count = 1;
        while (factorial <= n) {
            count++;
            factorial *= count;
        }
        return count - 1;
    }
}