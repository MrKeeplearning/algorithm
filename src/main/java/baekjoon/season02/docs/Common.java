package baekjoon.season02.docs;

public class Common {
    /**
     * 약수 합 구하기
     */
    public static long getSumOfDivisor(long targetNumber) {
        long sumOfDivisors = 0;

        for (long i = 1; i*i <= targetNumber; i++) {
            if (targetNumber % i == 0) {
                sumOfDivisors += i;

                // 완전제곱수는 제외
                if (i * i != targetNumber) {
                    sumOfDivisors += targetNumber / i;
                }
            }
        }

        return sumOfDivisors;
    }
}
