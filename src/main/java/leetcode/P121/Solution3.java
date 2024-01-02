package leetcode.P121;

public class Solution3 {
    /**
     * 매번 현재의 가격이 최소 가격인지 확인. 그렇지 않으면 최대 이익을 계산한다.
     * 한 번의 순회로 문제를 해결할 수 있게 된다.
     * O(N)의 시간 복잡도를 가진다.
     */
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
