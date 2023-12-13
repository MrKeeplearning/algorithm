package programmers.beginners.lessons120839;

import java.util.HashMap;

public class Solution {

    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Character> rspMap = new HashMap<>();

        rspMap.put('2', '0');
        rspMap.put('0', '5');
        rspMap.put('5', '2');

        for (int i = 0; i < rsp.length(); i++) {
            Character eachRSP = rspMap.get(rsp.charAt(i));
            sb.append(eachRSP);
        }
        return sb.toString();
    }
}