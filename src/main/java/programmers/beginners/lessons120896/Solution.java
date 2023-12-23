package programmers.beginners.lessons120896;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. 문자열을 문자 배열로 변환한다.
 * 2. 문자 배열을 스트림으로 변환한다.
 * 3. 각 문자에 대해, 그 문자가 문자열에 한 번만 등장하는지 확인한다.
 * 4. 한 번만 등장하는 문자만 필터링한다.
 * 5. 필터링된 문자를 오름차순으로 정렬한다.
 * 6. 정렬된 문자를 다시 문자열로 연결한다.
 */
public class Solution {
    public String solution(String s) {
        return Stream.of(s.split(""))
                .filter(c -> s.indexOf(c) == s.lastIndexOf(c))
                .sorted()
                .collect(Collectors.joining());
    }
}