package programmers.beginners.lessons120819;

public class Solution {
    private final int AMERICANO = 5500;
    public int[] solution(int money) {
        int max_americano = money / AMERICANO;
        int change = money % AMERICANO;
        return new int[]{max_americano, change};
    }
}