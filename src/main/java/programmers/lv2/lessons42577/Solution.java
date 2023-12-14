package programmers.lv2.lessons42577;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book, Comparator.comparing(String::length));
        for (int i = 0; i < phone_book.length - 1; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].startsWith(phone_book[i])) {
                    answer = false;
                }
            }
        }
        return answer;
    }
}
