package programmers.beginners.lessons120885;

public class Solution {
    public String solution(String bin1, String bin2) {
        int bin1Decimal = Integer.parseInt(bin1, 2);
        int bin2Decimal = Integer.parseInt(bin2, 2);
        int sum = bin1Decimal + bin2Decimal;
        return Integer.toBinaryString(sum);
    }
}
