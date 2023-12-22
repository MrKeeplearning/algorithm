package programmers.beginners.lessons120894;

public class Solution {
    public long solution(String numbers) {
        String[] engNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < engNumbers.length; i++) {
            numbers = numbers.replaceAll(engNumbers[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}