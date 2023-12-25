package programmers.beginners.lessons120883;

import java.util.HashMap;

public class Solution {
    public String solution(String[] id_pw, String[][] db) {
        /**
         * 1. hashmap에 db를 모두 넣고(originalMap), 복사본 copyMap을 따로 생성.
         * 2. id_pw를 넣었을 때 originalMap의 길이와 copyMap의 길이가 다르면 `return fail`
         * 3. 길이가 같다면 id_pw의 id를 키로 originalMap과 copyMap의 value를 비교.
         * 4. 비교 결과가 다르면 `return wrong pw`
         * 5. 비교 결과가 같으면 `return login`
         */
        HashMap<String, String> originalMap = new HashMap<>();
        for (String[] strings : db) {
            originalMap.put(strings[0], strings[1]);
        }
        HashMap<String, String> copyMap = new HashMap<>(originalMap);

        copyMap.put(id_pw[0], id_pw[1]);

        if (originalMap.size() != copyMap.size()) {
            return "fail";
        } else if (!originalMap.get(id_pw[0]).equals(copyMap.get(id_pw[0]))) {
            return "wrong pw";
        } else {
            return "login";
        }
    }
}