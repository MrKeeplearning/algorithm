package leetcode.P121;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 시간초과 발생
 */
class Solution2 {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        int answer = dp[0];
        for (int i = 0; i < prices.length; i++) {
            OptionalInt maxPrice = Arrays.stream(prices, i+1, prices.length).max();
            if (maxPrice.isPresent()) {
                dp[i] = maxPrice.getAsInt() - prices[i];
                answer = Math.max(answer, dp[i]);
            } else {
                dp[i] = 0;
            }
        }
        return answer;
    }
}