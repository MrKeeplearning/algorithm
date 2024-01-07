package programmers.beginners.lessons120878;

public class Solution2 {
    // 유한소수가 되려면, 분자를 분모로 나눴을 때 나머지가 없어야 하고, 그 분모가 2와 5의 배수여야 한다.
    // 즉, 분모가 2 또는 5로만 나누어지는지 검사하면 된다.
    // 분모를 2로 나눌 수 있는 경우, 계속 2로 나누어 간다.
    // 이후 5로도 나누어 간다.
    // 위 두 과정을 거쳐서 만약 분모가 1이 된다면, 이는 원래의 분모가 2나 5로만 구성되어 있었다는 것을 의미하므로 유한소수이다.
    // 그렇지 않으면 무한 소수이다.
    public int solution(int a, int b) {
        b = b / gcd(a, b);

        while (b % 2 == 0) {
            b = b / 2;
        }

        while (b % 5 == 0) {
            b = b / 5;
        }

        return (b == 1) ? 1 : 2;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}