package programmers.lv2.lessons42577;

import java.util.Arrays;

public class Solution2 {
    /**
     * 문자열 sort는 길이와는 관련이 없다.
     * 아스키코드 상에서 비교를 하는 것이기 때문에 119, 11 과 같은 식이 될 수 있다.
     * 따라서 sort를 하게 되면 바로 옆에 있는 값과 비교만 하면 된다.
     * 문제에서 접두사가 하나라도 있으면 false를 반환하도록 되어 있기 때문에 길이 별로 sort를 하는 작업이 필요없다.
     */
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
