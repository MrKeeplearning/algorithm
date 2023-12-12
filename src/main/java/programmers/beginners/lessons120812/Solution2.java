package programmers.beginners.lessons120812;

public class Solution2 {
    public int solution(int[] array) {
        // 각 숫자의 출현 횟수를 저장하는 배열 "counts".
        // 배열의 원소를 인덱스로 사용하는 배열이다.
        int[] counts = new int[1000];
        int maxCount = 0;
        int mode = -1;

        // 각 숫자의 count를 계산
        for (int num : array) {
            counts[num]++;

            // 현재 숫자의 count와 maxCount를 비교하고, 필요하다면 업데이트
            if (counts[num] > maxCount) {
                maxCount = counts[num];
                mode = num;
            }
        }

        // 두 번째로 빈번한 값을 찾아서, mode가 유일한 값인지 확인
        for (int num : array) {
            if (counts[num] == maxCount && num != mode) {
                return -1; // 최빈값이 여러개일 때
            }
        }

        return mode; // 최빈값이 하나일 때
    }
}
