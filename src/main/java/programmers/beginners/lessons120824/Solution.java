package programmers.beginners.lessons120824;

class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int evenCount = 0;
        for (int number : num_list) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }
        int oddCount = size - evenCount;
        return new int[]{evenCount, oddCount};
    }
}
