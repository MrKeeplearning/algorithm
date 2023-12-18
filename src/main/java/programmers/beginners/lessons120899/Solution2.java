package programmers.beginners.lessons120899;

public class Solution2 {
    public int[] solution(int[] array) {
        int max = 0;
        int maxIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        return new int[]{max, maxIndex};
    }
}
