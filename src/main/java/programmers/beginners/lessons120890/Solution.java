package programmers.beginners.lessons120890;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int gap = Math.abs(array[0] - n);

        for (int i = 0; i < array.length; i++) {
            int temp = Math.abs(array[i] - n);
            if (temp < gap || (temp == gap && array[i] < answer)) {
                answer = array[i];
                gap = temp;
            }
        }
        return answer;
    }
}