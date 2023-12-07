package programmers.beginners.lessons120842;

public class Solution {

    public static void main(String[] args) {
        solution([1, 2, 3, 4, 5, 6, 7, 8],2)
    }

    /**
     * num_list를 n으로 나누면 총 행의 개수가 나온다.
     */
    public static int[][] solution(int[] num_list, int n) {

        int len = num_list.length;
        int rowLen = len / n;

        int[][] answer = {};

        int count = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[count];
                count++;
            }
        }
        return answer;
    }

}
