package programmers.beginners.양꼬치;

public class Solution {
    public static void main(String[] args) {
        int solution = solution(10, 3);
        System.out.println(solution);
    }
    public static int solution(int n, int k) {
        int answer = 0;
        int initPrice = 12000 * n + 3000 * k;

        if (n >= 10) {
            int service = n / 10;
            answer = initPrice - service;
        }

        return answer;
    }

}
