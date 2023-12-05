package programmers.beginners.lessons120812;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] array) {
        // 배열의 각 값의 빈도수를 저장하기 위한 Map
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // 배열의 각 값의 빈도수 계산
        // countMap에서 num이라는 key에 맵핑된 값이 없다면
        // num에 맵핑된 value를 0으로 지정한 뒤 바로 1을 증가시킨다.
        // 즉, 해당 num의 빈도수는 1이 증가한 것이다.
        // HashMap은 동일 키 값을 추가할 경우 Value의 값이 덮어쓰기 된다.
        // 따라서 기존 key값의 value를 계속 사용하고 싶다면 getOrDefault를 사용해서
        // 아래와 같이 작성할 수 있다.
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 최빈값을 저장할 변수
        int answer = 0;
        // 최빈값의 빈도수를 저장할 변수
        int maxFrequency = 0;

        // 빈도수를 확인하면서 최빈값을 찾는다.
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                answer = num;
                maxFrequency = frequency;
            } else if (frequency == maxFrequency) {
                // 최빈값이 여러 개일 때 -1을 반환.
                return -1;
            }
        }
        return answer;
    }
}