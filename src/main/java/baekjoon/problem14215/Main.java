package baekjoon.problem14215;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int circumference = 0;  // 둘레
        int[] sides = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            sides[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sides);

        // 삼각형이 성립하지 않는 경우, 가장 긴 변의 길이를 삼각형의 성립조건에 맞게 조정한다.
        if (sides[2] >= sides[0] + sides[1]) {
            sides[2] = sides[0] + sides[1] - 1;
        }

        for (int side : sides) {
            circumference += side;
        }
        bw.write(circumference + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
