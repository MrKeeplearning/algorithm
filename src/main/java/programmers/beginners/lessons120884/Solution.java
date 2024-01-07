package programmers.beginners.lessons120884;

public class Solution {
    public static void main(String[] args) {
        int chicken = 1081;
        int answer = solution(chicken);
        System.out.println(answer);
    }
    public static int solution(int chicken) {
        int serviceChicken = 0;
        int leftCoupon = 0;
        while(true) {
            if (chicken / 10 == 0) {
                leftCoupon += chicken % 10;
                break;
            }
            serviceChicken += chicken / 10;
            leftCoupon += chicken % 10;
            chicken = chicken / 10;
            System.out.println("chicken = " + chicken);
            System.out.println("leftCoupon = " + leftCoupon);
        }
        serviceChicken += leftCoupon / 10;
        return serviceChicken;
    }
}