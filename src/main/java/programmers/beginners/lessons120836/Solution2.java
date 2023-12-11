package programmers.beginners.lessons120836;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    /**
     * 약수를 구해야 할 때 2로 나누면 연산과정을 줄일 수 있다. 100의 약수를 구하는 과정을 생각해보자. 1과 100은 기본으로 깔고 들어간다. 그런데 그 다음 수인 2는 50과 매칭되고, 그 뒤로는 50
     * 미만의 숫자들에서만 약수가 나온다. 마찬가지로 3의 배수로 약수를 구해야 한다면 3의 배수에 매칭되는 수 미만의 숫자들에서만 약수가 나온다. 그런데, 2의 배수인 경우와 3의 배수인 경우를 모두 따지는
     * 것이 번거롭다면 2로 나눈 경우부터 시작하는 것도 괜찮다.
     */
    public int solution(int n) {

        // 100 = 10 * 10과 같이 같은 수끼리 약수인 경우를 대비해서 Set을 사용했다.
        Set<Integer> integers = new HashSet<>();

        if (n == 1) {
            return 1;
        } else if (n <= 3) {
            return 2;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (integers.contains(i)) {
                    break;
                } else {
                    addDivisor(n, i, integers);
                }
            }
            // 1과 n은 n이 어떤 수이던 무조건 약수로 가진다.
            return integers.size() + 2;
        }
    }

    public static void addDivisor(int n, int i, Set<Integer> integers) {
        if (n % i == 0) {
            integers.add(i);
            integers.add(n / i);
        }
    }
}
