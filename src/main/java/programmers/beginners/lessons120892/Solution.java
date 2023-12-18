package programmers.beginners.lessons120892;

public class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = cipher.toCharArray();
        int i = 1;
        while ((code * i) - 1 < cipher.length()) {
            sb.append(charArray[code * i - 1]);
            i++;
        }
        return sb.toString();
    }
}