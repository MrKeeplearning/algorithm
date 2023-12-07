package programmers.beginners.lessons120842;

public class Solution {

    /**
     * num_list를 n으로 나누면 총 행의 개수가 나온다.
     */
    public int[][] solution(int[] num_list, int n) {
        int row_length = num_list.length / n;
        int[][] answer = new int[row_length][n];
        int index = 0;  // num_list 값을 가져올 때 사용할 index
        for (int i = 0; i < row_length; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }
        return answer;
    }

}
