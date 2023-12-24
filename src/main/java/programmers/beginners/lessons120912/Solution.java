package programmers.beginners.lessons120912;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array) {
        String[] strArray = Arrays.stream(array)
                .mapToObj(Integer::toString)
                .toArray(String[]::new);
        StringBuilder numbers = new StringBuilder();
        for (String number : strArray) {
            numbers.append(number);
        }
        String onlySeven = numbers.toString().replaceAll("[^7]", "");
        return onlySeven.length();
    }
}