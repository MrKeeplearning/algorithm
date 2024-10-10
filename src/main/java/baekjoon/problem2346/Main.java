package baekjoon.problem2346;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Balloon> balloons = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            balloons.add(new Balloon(i + 1, Integer.parseInt(st.nextToken())));
        }

        StringBuilder result = new StringBuilder();
        int currentIndex = 0;   // 첫 번째 풍선부터 시작

        while (!balloons.isEmpty()) {
            Balloon currentBalloon = balloons.remove(currentIndex);
            result.append(currentBalloon.index).append(" ");

            if (balloons.isEmpty()) break;  // 더 이상 풍선이 없다면 종료

            int move = currentBalloon.value;

            // 풍선을 터뜨린 후 이동할 위치 계산 (양수면 오른쪽, 음수면 왼쪽)
            if (move > 0) {
                currentIndex = (currentIndex + (move - 1)) % balloons.size();   // 오른쪽 이동
            } else {
                currentIndex = (currentIndex + move) % balloons.size();     // 왼쪽 이동
                if (currentIndex < 0) {     // 음수 인덱스 처리
                    currentIndex += balloons.size();
                }
            }
        }

        bw.write(result.toString());

        br.close();
        bw.close();
    }

    static class Balloon {
        int index;
        int value;

        public Balloon(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
