package programmers.beginners.lessons120921;

class Solution {

    public int solution1(String A, String B) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(A);
        while (!sb.toString().equals(B)) {

            answer++;
            sb.insert(0, sb.charAt(sb.length() - 1));
            sb.delete(sb.length()-1, sb.length());
            if (answer > A.length()) {
                answer = -1;
                break;
            }
        }
        return answer;
    }

    public int solution2(String A, String B) {
        int answer = -1;
        StringBuilder sb = new StringBuilder(A);
        for (int i = 0; i < A.length(); i++) {
            if (sb.toString().equals(B)) {
                answer = i;
                break;
            }
            sb.insert(0, sb.charAt(sb.length()-1));
            sb.delete(sb.length()-1, sb.length());
        }
        return answer;
    }
}