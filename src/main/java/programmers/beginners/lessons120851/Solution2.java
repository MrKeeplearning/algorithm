package programmers.beginners.lessons120851;

public class Solution2 {
    public int solution(String my_string) {
        int answer = 0;
        String onlyNumber = my_string.replaceAll("[^0-9]", "");
        for (char character : onlyNumber.toCharArray()) {
            answer += Character.getNumericValue(character);
        }
        return answer;
    }
}
