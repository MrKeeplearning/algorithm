package programmers.beginners.lessons120884;

class Solution2 {
    public int solution(int chicken) {
        int serviceChicken = 0;
        int coupons = chicken;

        while (coupons >= 10) {
            int additionalChicken = coupons / 10;
            serviceChicken += additionalChicken;
            // 서비스로 받은 치킨에도 쿠폰 1장이 포함됨.
            coupons = additionalChicken + coupons % 10;
        }

        return serviceChicken;
    }
}