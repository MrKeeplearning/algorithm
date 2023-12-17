package programmers.beginners.lessons120909;

public class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        double floor = Math.floor(sqrt);
        return (sqrt == floor) ? 1 : 2;
    }
}