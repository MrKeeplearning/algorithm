package programmers.beginners.lessons120892;

public class Solution2 {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        for (int i = code; i <= cipher.length(); i = i + code) {
            sb.append(cipher.charAt(i - 1));
        }
        return sb.toString();
    }
}