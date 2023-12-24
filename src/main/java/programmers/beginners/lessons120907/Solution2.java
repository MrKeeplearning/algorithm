package programmers.beginners.lessons120907;

public class Solution2 {
    // String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split("\\s");
            int num1 = Integer.parseInt(split[0]);
            int num2 = Integer.parseInt(split[2]);
            int total = split[1].equals("+") ? num1 + num2 : num1 - num2;
            answer[i] = total == Integer.parseInt(split[4]) ? "O" : "X";
        }
        return answer;
    }
}
