package programmers.beginners.lessons120816;

public class Solution {
    /**
     * pizza는 피자 판 수
     * (slice * pizza) >= n
     * 위의 케이스를 가장 첫 번째로 맞이하는 pizza를 반환
     */
    public int solution(int slice, int n) {
        int pizza = 0;
        while (slice * pizza < n) {
            pizza++;
        }
        return pizza;
    }
}
