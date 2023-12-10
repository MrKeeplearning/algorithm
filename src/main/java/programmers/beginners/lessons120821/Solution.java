package programmers.beginners.lessons120821;

public class Solution {
    public int[] solution(int[] num_list) {
        int left = 0;
        int right = num_list.length - 1;

        // left와 right가 중간에서 만날 때까지 반복한다.
        while (left < right) {
            // left와 right의 element를 교환한다.
            int temp = num_list[left];
            num_list[left] = num_list[right];
            num_list[right] = temp;

            left++;
            right--;
        }
        return num_list;
    }
}