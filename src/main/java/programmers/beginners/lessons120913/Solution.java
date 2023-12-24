package programmers.beginners.lessons120913;

import java.util.ArrayList;

public class Solution {

    public String[] solution(String my_str, int n) {
        ArrayList<String> strings = new ArrayList<>();
        int remainder = my_str.length() % n;
        int begin = 0;
        int end = 0;

        for (int i = n-1; i < my_str.length(); i += n) {
            end = i+1;
            strings.add(my_str.substring(begin, end));
            begin = i+1;
        }

        if (remainder != 0) {
            strings.add(my_str.substring(my_str.length() - remainder));
        }

        return strings.toArray(new String[0]);
    }
}