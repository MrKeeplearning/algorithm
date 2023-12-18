package programmers.beginners.lessons120840;

class Solution6 {
    /**
     * 재귀를 사용한 풀이
     */
    static int answer = 0;

    public int solution(int balls, int share) {

        share_count(balls, share, 0, 0);
        return answer;
    }
    static void share_count(int balls, int share, int count, int start){
        if(count == share) {
            answer++;
            return;
        }
        for(int i=start; i<balls; i++){
            share_count(balls, share, count+1, i+1);
        }
    }
}