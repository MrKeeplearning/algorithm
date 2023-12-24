package programmers.beginners.lessons120911;

import java.util.Arrays;

public class Solution {
    public static String solution(String my_string) {
        char[] charArray = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}