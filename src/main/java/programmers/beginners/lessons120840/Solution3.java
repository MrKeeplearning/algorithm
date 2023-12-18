package programmers.beginners.lessons120840;

class Solution3 {
    public int solution(int balls, int share) {
        long answer = 1;
        int denominator = 1;
        // n!의 분모에서 n > m이 항상 성립하는 경우이기 때문에 m!만큼을 약분
        for(int i = share+1; i <= balls; i++){
            answer *= i;
            // 동시에 (n-m)!도 분모와 약분을 진행한다.
            // 이미 n!은 m!으로 약분된 상황인데, 약분된 상황에서 팩토리얼 연산을 하는 횟수만큼
            // (n-m)!도 동일한 횟수만큼 팩토리얼 연산을 진행한다.
            answer /= denominator;
            denominator++;
        }
        return (int)answer;
    }
}