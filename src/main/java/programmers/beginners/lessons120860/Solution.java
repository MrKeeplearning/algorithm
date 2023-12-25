package programmers.beginners.lessons120860;

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public int solution(int[][] dots) {
        HashSet<Integer> setX = new HashSet<>();
        HashSet<Integer> setY = new HashSet<>();
        for (int[] dot : dots) {
            setX.add(dot[0]);
            setY.add(dot[1]);
        }

        Iterator<Integer> iteratorX = setX.iterator();
        int valueX1 = iteratorX.next();
        int valueX2 = iteratorX.next();

        Iterator<Integer> iteratorY = setY.iterator();
        int valueY1 = iteratorY.next();
        int valueY2 = iteratorY.next();

        return Math.abs(valueX2 - valueX1) * Math.abs(valueY2 - valueY1);
    }
}
