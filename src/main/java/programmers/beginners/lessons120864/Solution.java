package programmers.beginners.lessons120864;

public class Solution {
    public static void main(String[] args) {
        String my_string = "1a2b3c4d123Z";
        System.out.println(solution(my_string));
    }
    public static int solution(String my_string) {
        int answer = 0;
        StringBuilder number = new StringBuilder();
        // 문자열을 하나씩 순회하면서 현재 문자가 숫자인지 확인한다.
        // 숫자라면 StringBuilder에 추가,
        // 아니면 StringBuilder에 저장된 숫자를 answer에 더한 후 StringBuilder를 초기화
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            } else {
                if (number.length() != 0) {
                    answer += Integer.parseInt(number.toString());
                    number.setLength(0);
                }
            }
        }
        // 문자열 순회가 끝난 뒤에 StringBuilder에 숫자가 남아 있다면, 이것도 answer에 더한다.
        // 이때는 StringBuilder를 비우는 작업을 할 필요가 없다.
        if (number.length() != 0) {
            answer += Integer.parseInt(number.toString());
        }

        return answer;
    }
}