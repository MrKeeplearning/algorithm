package programmers.lv1.lessons42576;

import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {

    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        HashMap<String, Integer> participantMap = new HashMap<>();
        for (String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {
            if (participantMap.containsKey(name)) {
                participantMap.put(name, participantMap.get(name) - 1);
            }
        }

        for (String s : participantMap.keySet()) {
            System.out.println(s + ", " + participantMap.get(s));
        }

        for (String name : participantMap.keySet()) {
            if (participantMap.get(name) > 0) {
                System.out.println(name);
            }
        }

        for (Entry<String, Integer> entry : participantMap.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }
    }
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> participantMap = new HashMap<>();

        for (String name : participant) {
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {
            if (participantMap.containsKey(name)) {
                participantMap.put(name, participantMap.get(name) - 1);
            }
        }

        for (String name : participantMap.keySet()) {
            if (participantMap.get(name) > 0) {
                answer = name;
            }
        }
        return answer;
    }
}