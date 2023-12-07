package programmers.beginners.lessons120815;

public class Solution {

    private static final int PIECE_OF_PIZZA = 6;

    public int solution(int n) {
        int lcm = lcm(n, PIECE_OF_PIZZA);
        return lcm / PIECE_OF_PIZZA;
    }

    public static int gcd(int p, int q) {
        int max = Math.max(p, q);
        int min = Math.min(p, q);
        if (min == 0) {
            return max;
        }
        return gcd(min, max % min);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

}
