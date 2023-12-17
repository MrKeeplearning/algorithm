package programmers.beginners.lessons120903;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int solution(String[] s1, String[] s2) {
        List<String> s2List = Arrays.asList(s2);
        ArrayList<String> s2ArrayList = new ArrayList<>(s2List);
        int count = 0;

        for (String s : s1) {
            if (s2ArrayList.contains(s)) {
                count++;
            }
        }

        return count;
    }
}