package baekjoon.problem10101;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String answer;
        int angle1 = Integer.parseInt(br.readLine());
        int angle2 = Integer.parseInt(br.readLine());
        int angle3 = Integer.parseInt(br.readLine());
        boolean summation = angle1 + angle2 + angle3 == 180;

        if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            answer = "Equilateral";
        } else if (summation && angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
            answer = "Isosceles";
        } else if (summation) {
            answer = "Scalene";
        } else {
            answer = "Error";
        }

        bw.write(answer);
        bw.flush();

        br.close();
        bw.close();
    }
}