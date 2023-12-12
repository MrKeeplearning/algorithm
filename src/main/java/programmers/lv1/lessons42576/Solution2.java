package programmers.lv1.lessons42576;

import java.util.HashMap;

/**
 * 사실상 흩어진 코드를 묶어놓은 수준...
 */
public class Solution2 {

    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participantMap = new HashMap<>();

        // 모든 참가자를 map에 넣기
        for (String name : participant) {
            // participantMap.getOrDefault(name, 0) + 1 코드는 이름에 해당하는 참가자의 수를 가져온다.
            // getOrDefault 메서드는 주어진 key에 해당되는 value를 반환한다.
            // key가 없다면 default value를 반환한다. 여기서 defaultValue는 0이다.
            // 참가자가 아직 participantMap에 없으면 0을 반환하고 1을 더해서 participantMap에 추가한다.
            // 만약 참가자가 participantMap에 존재하면 defaultValue인 0이 아니라 1이상의 숫자를 가지고 있을테고,
            // 기존의 값에 1을 더해서 동명이인 참가자 수의 count를 증가시킨다.
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }

        // 완료선수들의 리스트를 살펴본다.
        for (String name : completion) {
            // 참가자들 중 완료한 선수에 해당된다면...
            if (participantMap.containsKey(name)) {
                // count가 1이라는 것은 해당 선수가 참가자 명단에 단 한번만 등장했다는 것을 뜻한다.
                if (participantMap.get(name) == 1) {
                    // 완주를 했기 때문에 참가자 명단에 더 이상 있을 필요가 없다. -> 제거!
                    participantMap.remove(name);
                } else {
                    // count가 1보다 크다면, 동일한 이름을 가진 여러 명의 참가자 중에서
                    // 아직 완주하지 못한 참가자가 있다는 뜻이다!
                    // count를 1만큼 감소시키지만, 여전히 participantMap에 남아 있다.
                    participantMap.put(name, participantMap.get(name) - 1);
                }
            }
        }
        return participantMap.keySet().iterator().next();
    }
}