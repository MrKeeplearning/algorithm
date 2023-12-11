package programmers.beginners.lessons120835;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Solution {
    public static int[] solution(int[] emergency) {
        HashMap<Integer, Integer> mappedEmergency = new HashMap<>();

        int[] emergencyCopy = Arrays.copyOf(emergency, emergency.length);
        int[] answer = new int[emergency.length];

        int index = 0;

        // emergenceyCopy를 역순으로 정렬
        int[] sortedEmergency = Arrays.stream(emergencyCopy)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(number -> number)
                .toArray();

        // key = emergency, value = 응급도 형태로 HashMap에 저장
        // emergency 숫자가 클수록 응급도가 작은 숫자를 배정했다.
        // 예를 들어 emergency가 [30, 10, 23, 6, 100]	와 같을 때
        // 100의 응급도는 1이다.
        for (int i = 0; i < sortedEmergency.length; i++) {
            mappedEmergency.put(sortedEmergency[i], i + 1);
        }

        for (int emergencyNumber : emergency) {
            if (mappedEmergency.containsKey(emergencyNumber)) {
                answer[index] = mappedEmergency.get(emergencyNumber);
                index++;
            }
        }

        return answer;
    }
}