package programmers.beginners.lessons120864;

import java.util.StringTokenizer;

public class Solution2 {
    public int solution(String my_string) {
        int answer = 0;
        String numbers = my_string.replaceAll("[^0-9]", " ");
        StringTokenizer stringTokenizer = new StringTokenizer(numbers, " ");
        while (stringTokenizer.hasMoreTokens()) {
            answer += Integer.parseInt(stringTokenizer.nextToken());
        }
        return answer;
    }
}
