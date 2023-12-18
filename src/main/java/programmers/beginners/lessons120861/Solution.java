package programmers.beginners.lessons120861;

public class Solution {
    /**
     * 가로 크기: 꼭짓점의 개수
     * 세로 크기: 꼭짓점의 개수
     */
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xInit = 0;
        int yInit = 0;
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        for (String direction : keyinput) {
            if (direction.equals("left") && xInit > -maxX) {
                xInit -= 1;
            } else if (direction.equals("right") && xInit < maxX) {
                xInit += 1;
            } else if (direction.equals("up") && yInit < maxY) {
                yInit += 1;
            } else if (direction.equals("down") && yInit > -maxY) {
                yInit -= 1;
            }
        }
        answer[0] = xInit;
        answer[1] = yInit;
        return answer;
    }
}