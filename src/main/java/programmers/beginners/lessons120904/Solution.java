package programmers.beginners.lessons120904;

public class Solution {
    public int solution(int num, int k) {
        String stringNum = String.valueOf(num);
        int indexNumber = stringNum.indexOf(Character.forDigit(k, 10));
        return (indexNumber != -1) ? indexNumber + 1 : indexNumber;
    }
}