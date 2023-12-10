package programmers.beginners.lessons120818;

public class Solution {
    private final int ZERO = 0;
    private final int ONE = 100_000;
    private final int THREE = 300_000;
    private final int FIVE = 500_000;
    private final double DISCOUNT_ONE = 0.05;
    private final double DISCOUNT_THREE = 0.1;
    private final double DISCOUNT_FIVE = 0.2;

    public int solution(int price) {
        int cost;

        if (price >= FIVE) {
            cost = extracted(price, DISCOUNT_FIVE);
        } else if (price >= THREE) {
            cost = extracted(price, DISCOUNT_THREE);
        } else if (price >= ONE) {
            cost = extracted(price, DISCOUNT_ONE);
        } else if (price >= ZERO) {
            cost = price;
        } else {
            throw new IllegalArgumentException("Invalid price");
        }

        return cost;
    }

    private int extracted(int price, double percentage) {
        double discountedPrice = discountCalculator(price, percentage);
        return (int) Math.floor(discountedPrice);
    }

    public double discountCalculator(int price, double discount) {
        return price - (price * discount);
    }

}