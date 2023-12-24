package programmers.beginners.lessons120907;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(solution(quiz)));
    }
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int count = 0;
        for (String string : quiz) {
            int realAnswer = 0;
            int idx = string.indexOf("=");
            int givenAnswer = Integer.parseInt(string.substring(idx + 1).replaceAll("\\s", ""));
            String[] split = string.substring(0, idx).split("\\s");

            int num1 = Integer.parseInt(split[0]);
            int num2 = Integer.parseInt(split[2]);

            if (split[1].equals("+")) {
                realAnswer = num1 + num2;
            } else if (split[1].equals("-")) {
                realAnswer = num1 - num2;
            }

            if (realAnswer == givenAnswer) {
                answer[count] = "O";
            } else {
                answer[count] = "X";
            }
            count += 1;
        }
        return answer;
    }
}

