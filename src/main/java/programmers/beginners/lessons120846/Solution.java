package programmers.beginners.lessons120846;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (getDivisorsSize(i) >= 3) {
                count++;
            }
        }
        return count;
    }

    public static int getDivisorsSize(int number) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);

                // i에 대응되는 약수를 같이 저장한다.
                // 예를 들어 number가 36일 때 i가 2라면 18도 함께 저장된다.
                // 한편 6과 같이 두 번 중복되는 약수는 이곳에서 걸러지게 되고 단 한 번만 add된다.
                if (i != (number / i)) {
                    divisors.add(number / i);
                }
            }
        }

        return divisors.size();
    }
}