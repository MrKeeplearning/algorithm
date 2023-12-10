package programmers.beginners.lessons120822;

public class Solution2 {
    public String solution(String my_string) {
        return new StringBuilder(my_string)
                .reverse()
                .toString();
    }
}
