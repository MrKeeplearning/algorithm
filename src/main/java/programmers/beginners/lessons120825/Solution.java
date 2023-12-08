package programmers.beginners.lessons120825;

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            sb.append(String.valueOf(c).repeat(n));
        }

        return sb.toString();
    }

    // toCharArray를 사용해서 enhanced for문 사용하기
    public String solution2(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            sb.append(String.valueOf(c).repeat(n));
        }
        return sb.toString();
    }

}
