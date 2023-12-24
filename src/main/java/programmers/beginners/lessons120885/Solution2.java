package programmers.beginners.lessons120885;

public class Solution2 {
    public String solution(String bin1, String bin2) {
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        int carry = 0;  // 두 비트의 합이 2가 넘을 경우 carry 발생
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += bin2.charAt(j--) - '0';
            if (i >= 0) sum += bin1.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry); // carry가 0이 아니라면 더해줍니다
        return sb.reverse().toString();
    }
}