package programmers.beginners.lessons120843;

/**
 * k = 5
 * numbers.length = 6
 * i	currentIndex
 * 1	2 % 6 == 2
 * 2	4 % 6 == 4
 * 3	6 % 6 == 0
 * 4	2 % 6 == 2
 * 첫 번째로 던지는 사람은 항상 1번이다.
 * 따라서 첫 번째 던지는 사람은 생략하고 for문을 돈다.
 */
class Solution {
    public int solution(int[] numbers, int k) {
        int currentIndex = 0;
        for (int i = 1; i < k; i++) {
            currentIndex = (currentIndex + 2) % numbers.length;
        }
        return numbers[currentIndex];
    }
}
