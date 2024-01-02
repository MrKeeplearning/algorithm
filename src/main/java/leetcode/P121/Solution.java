package leetcode.P121;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 시간초과 발생
 */
class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int[] dp = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            OptionalInt maxPrice = Arrays.stream(prices, i+1, prices.length).max();
            if (maxPrice.isPresent()) {
                dp[i] = maxPrice.getAsInt() - prices[i];
            } else {
                dp[i] = 0;
            }
        }
        OptionalInt optionalInt = Arrays.stream(dp).max();
        if (optionalInt.isPresent()) {
            answer = optionalInt.getAsInt();
        }
        return answer;
    }
}