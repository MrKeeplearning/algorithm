package programmers.beginners.lessons120902;

import java.util.ArrayList;

public class Solution {
    public int solution(String my_string) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();

        for (String string : my_string.split("\\s")) {
            try {
                numbers.add(Integer.parseInt(string));
            } catch (NumberFormatException e) {
                operators.add(string);
            }
        }

        int result = numbers.get(0);

        for (int i = 0; i < operators.size(); i++) {
            if (operators.get(i).equals("+")) {
                result += numbers.get(i + 1);
            } else if (operators.get(i).equals("-")) {
                result -= numbers.get(i + 1);
            }
        }

        return result;
    }
}