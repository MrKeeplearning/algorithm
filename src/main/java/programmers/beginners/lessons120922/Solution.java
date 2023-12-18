package programmers.beginners.lessons120922;

public class Solution {
    /**
     * 가로가 1이면 0번, 가로가 2이면 1번, 가로가 3이면 2번 => 가로길이 - 1
     * 세로가 1이면 0번 * 가로길이, 세로가 2이면 1번 * 가로길이, 세로가 3이면 2번 * 가로길이 => (세로길이 - 1) * 가로길이
     */
    public int solution(int M, int N) {
        int width = M - 1;
        int height = (N - 1) * M;
        return width + height;
    }
}