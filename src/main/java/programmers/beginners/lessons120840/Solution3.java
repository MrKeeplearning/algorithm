package programmers.beginners.lessons120840;

class Solution3 {
    public int solution(int balls, int share) {
        long answer = 1;
        int denominator = 1;
        for(int i = share+1; i <= balls; i++){
            answer *= i;
            answer /= denominator;
            denominator++;
        }
        return (int)answer;
    }
}