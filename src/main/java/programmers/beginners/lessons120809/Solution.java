package programmers.beginners.lessons120809;

class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[numbers.length];
        int i = 0;
        for (int number : numbers) {
            result[i++] = number * 2;
        }
        return result;
    }
}