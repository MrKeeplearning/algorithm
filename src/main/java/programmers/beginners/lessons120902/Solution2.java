package programmers.beginners.lessons120902;

public class Solution2 {
    public int solution(String my_string) {
        String[] splitWords = my_string.split(" ");
        int answer = Integer.parseInt(splitWords[0]);

        for (int i = 1; i < splitWords.length; i += 2) {
            if (splitWords[i].equals("+")) {
                answer += Integer.parseInt(splitWords[i + 1]);
            } else if (splitWords[i].equals("-")) {
                answer -= Integer.parseInt(splitWords[i + 1]);
            }
        }
        return answer;
    }
}
