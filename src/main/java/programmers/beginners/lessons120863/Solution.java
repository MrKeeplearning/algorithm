package programmers.beginners.lessons120863;

public class Solution {
    public String solution(String polynomial) {
        int firstDegreeTerm = 0;    // 일차 항
        int constantTerm = 0;       // 상수 항
        
        // 덧셈 연산자를 기준으로 분리
        String[] terms = polynomial.split("\\+");

        for (String term : terms) {
            term = term.trim(); // 공백 제거
            if (term.contains("x")) {
                // 일차 항일 경우, 일차 항의 계수를 더한다.
                String coefficient = term.replace("x", "").trim();
                firstDegreeTerm += coefficient.isEmpty() ? 1 : Integer.parseInt(coefficient);
            } else {
                constantTerm += Integer.parseInt(term);
            }
        }

        String result = "";
        // 일차 항 생성
        if (firstDegreeTerm > 1) {
            result += firstDegreeTerm + "x";
        } else if (firstDegreeTerm == 1) {
            result += "x";
        }

        // 상수 항 생성
        if (constantTerm > 0) {
            if (!result.isEmpty()) {
                result += " + ";
            }
            result += constantTerm;
        }

        return result;
    }
}
