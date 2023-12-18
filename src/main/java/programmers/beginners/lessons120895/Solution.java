package programmers.beginners.lessons120895;

public class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;

        for (char c : charArray) {
            sb.append(c);
        }

        return sb.toString();
    }
}