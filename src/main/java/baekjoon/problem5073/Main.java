package baekjoon.problem5073;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] sides = new int[3];

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sides[0] = Integer.parseInt(st.nextToken());
            sides[1] = Integer.parseInt(st.nextToken());
            sides[2] = Integer.parseInt(st.nextToken());

            // "0 0 0" 입력시 종료
            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
                break;
            }

            Arrays.sort(sides);

            if (sides[2] >= sides[0] + sides[1]) {
                bw.write("Invalid\n");
            } else {
                String type = triangle(sides);
                bw.write(type + "\n");
            }
        }

        br.close();
        bw.close();
    }

    public static String triangle(int[] angles) {
        String answer;
        if (angles[0] == angles[1] && angles[1] == angles[2]) {
            answer = "Equilateral";
        } else if (angles[0] == angles[1] || angles[0] == angles[2] || angles[1] == angles[2]) {
            answer = "Isosceles";
        } else {
            answer = "Scalene";
        }
        return answer;
    }
}
