package programmers.lv2.lessons42888;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;

class Solution {

    public String[] solution(String[] record) {

        int lengthOfRecord = record.length;
        ArrayList<String> answer = new ArrayList<>();

        // uid 리스트
        HashSet<String> uidSet = new HashSet<>();

        // uid와 NickName Map
        // key=uid, value=NickName
        Map<String, String> uidNickMap = new HashMap<>();

        // 토큰화된 String을 담은 배열
        ArrayList<List<String>> tokenData = new ArrayList<>();

        for (String s : record) {
            StringTokenizer st = new StringTokenizer(s);
            ArrayList<String> tokensList = new ArrayList<>();
            while (st.hasMoreElements()) {
                tokensList.add(st.nextToken());
            }
            uidSet.add(tokensList.get(1));
            tokenData.add(tokensList);
        }

        while (!uidSet.isEmpty()) {
            for (int i = tokenData.size() - 1; i >= 0; i--) {
                // 길이가 3이라는 것은 NickName 정보를 가지고 있다는 것
                String uid = tokenData.get(i).get(1);
                if (uidSet.contains(uid) && tokenData.get(i).size() == 3) {
                    uidNickMap.put(uid, tokenData.get(i).get(2));
                    uidSet.remove(uid);
                }
            }
        }

        for (int i = 0; i < lengthOfRecord; i++) {
            if (tokenData.get(i).size() == 3 && tokenData.get(i).get(0).equals("Enter")) {
                String korean = uidNickMap.get(tokenData.get(i).get(1)) + toKorean(tokenData.get(i));
                answer.add(korean);
            } else if (tokenData.get(i).size() == 2 && tokenData.get(i).get(0).equals("Leave")){
                String korean = uidNickMap.get(tokenData.get(i).get(1)) + toKorean(tokenData.get(i));
                answer.add(korean);
            }
        }

        String[] result = new String[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }

    public static String toKorean(List<String> ithTokenData) {
        String koreanMessage = "";

        if (Objects.equals(ithTokenData.get(0), "Enter")) {
            koreanMessage = "님이 들어왔습니다.";
        } else if (Objects.equals(ithTokenData.get(0), "Leave")) {
            koreanMessage = "님이 나갔습니다.";
        }

        return koreanMessage;
    }
}