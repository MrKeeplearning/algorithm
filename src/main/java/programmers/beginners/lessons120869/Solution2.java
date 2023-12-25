package programmers.beginners.lessons120869;

import java.util.HashMap;

public class Solution2 {
    public static void main(String[] args) {
        String[] spell = {"a", "b", "c"};
        String[] dic = {"abcd", "efg"};
        int solution = solution(spell, dic);
        System.out.println(solution);
    }
    public static int solution(String[] spell, String[] dic) {
        HashMap<String, Integer> spellMap = new HashMap<>();
        for (String s : spell) {
            // 1. 문자열 s를 키로 사용해서 spellMap에서 값을 찾는다.
            // 2. 만약 s가 spellMap에 존재하면, 그 값(s의 등장 횟수)을 가져온다. 그렇지 않으면 0을 반환한다.
            // 3. 이 값에 1을 더한다. 이것은 s의 새로운 등장을 더하는 것으로 해석할 수 있다.
            spellMap.put(s, spellMap.getOrDefault(s, 0) + 1);
        }

        for (String word : dic) {
            HashMap<String, Integer> wordMap = new HashMap<>();
            for (char c : word.toCharArray()) {
                String s = String.valueOf(c);
                wordMap.put(s, wordMap.getOrDefault(s, 0) + 1);
            }
            if (spellMap.equals(wordMap)) {
                return 1;
            }
        }
        return 2;
    }
}
