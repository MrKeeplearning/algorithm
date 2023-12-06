package programmers.beginners.lessons120808;

class Solution {

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denominator = lcm(denom1, denom2);
        int firstNumer = numer1 * (denominator / denom1);
        int secondNumer = numer2 * (denominator / denom2);
        int numerator = firstNumer + secondNumer;
        int gcd = gcd(numerator, denominator);
        int[] answer = {numerator / gcd, denominator / gcd};
        return answer;
    }

    public static int gcd(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        while (min != 0) {
            int remainder = max % min;
            max = min;
            min = remainder;
        }
        return max;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}