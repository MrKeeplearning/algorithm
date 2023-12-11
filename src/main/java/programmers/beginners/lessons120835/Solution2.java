package programmers.beginners.lessons120835;

public class Solution2 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < answer.length; i++) {
            // answer 배열이 만들어질 때 기본값으로 초기화되기 때문에 정수 0이 들어간다.
            // 즉, 0이 아니라는 것은 순위가 정해진 answer의 인덱스 번호라는 뜻이고,
            // 해당 번호는 뛰어넘는 다는 것을 의미한다.
            if (answer[i] != 0) {
                continue;
            }
            // emergency의 숫자가 클수록 가중치를 높게 부여한다.
            int idx = 1;
            for (int j = 0; j < answer.length; j++) {
                if (emergency[i] < emergency[j]) {
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}