package programmers.beginners.lessons120849;

public class Solution2 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            // my_string의 문자가 "aeiou"내에 존재하지 않는다면 인덱스 값으로 -1을 반환하게 된다.
            // 반면 동일한 문자가 "aeiou"내에 존재하면 해당 인덱스 값을 반환한다.
            // 따라서, sb에는 모음이 아닌 문자만 담기게 된다.
            if ("aeiou".indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
