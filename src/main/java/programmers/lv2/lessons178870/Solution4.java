package programmers.lv2.lessons178870;

import java.awt.Point;
import java.util.*;
import java.util.List;
class Solution4 {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        List<Point> list = new ArrayList<>();

        // 좌표를 나타내는 Point클래스를 사용해서 포인터로 활용
        // x: start pointer, y: end pointer
        Point p = new Point(0,0);
        // 합계를 나타내는 sum은 sequence의 가장 첫 번째 값으로 설정
        int sum = sequence[0];
        while (true) {
            if (sum == k) {
                list.add(new Point(p.x, p.y));
                sum -= sequence[p.x];
                p.x++;
            } else if (sum > k) {
                sum -= sequence[p.x];
                p.x++;
            } else {
                p.y++;
                if(p.y == sequence.length) break;
                sum += sequence[p.y];
            }
        }
        int min = Integer.MAX_VALUE;
        for (Point point : list) {
            int diff = point.y - point.x;
            if (min > diff) {
                answer[0] = point.x;
                answer[1] = point.y;
                min = diff;
            }
        }
        return answer;
    }
}