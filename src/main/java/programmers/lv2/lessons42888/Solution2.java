package programmers.lv2.lessons42888;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution2 {

    public static void main(String[] args) {

        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
                "Change uid4567 Ryan"};

        List<String> answer = new ArrayList<>();
        Map<String, String> userId = new HashMap<>();
        for (String r : record) {
            String[] parts = r.split(" ");
            if (parts[0].equals("Enter") || parts[0].equals("Change")) {
                userId.put(parts[1], parts[2]);
            }
        }

        for (String r : record) {
            String[] parts = r.split(" ");
            if (parts[0].equals("Enter")) {
                answer.add(userId.get(parts[1]) + "님이 들어왔습니다.");
            } else if (parts[0].equals("Leave")) {
                answer.add(userId.get(parts[1]) + "님이 나갔습니다.");
            }
        }
    }

    public String[] solution(String[] record) {
        List<String> answer = new ArrayList<>();
        Map<String, String> userId = new HashMap<>();
        for (String r : record) {
            String[] parts = r.split(" ");
//            if (parts[0].equals("Enter") || parts[0].equals("Change")) {
//                userId.put(parts[1], parts[2]);
//            }
            if (parts[0].equals("Leave")) {
                continue;
            }
            userId.put(parts[0], parts[2]);
        }

        for (String r : record) {
            String[] parts = r.split(" ");
            if (parts[0].equals("Enter")) {
                answer.add(userId.get(parts[1]) + "님이 들어왔습니다.");
            } else if (parts[0].equals("Leave")) {
                answer.add(userId.get(parts[1]) + "님이 나갔습니다.");
            }
        }

        return answer.toArray(new String[0]);
    }
}