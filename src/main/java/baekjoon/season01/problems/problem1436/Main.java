package baekjoon.season01.problems.problem1436;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int targetNumber = 666;
        int count = 1;

        // 가장 작은 수는 666
        // 666부터 시작해서 1씩 늘려가고, 666이 들어간 수를 찾으면 count값을 1 증가시킨다.
        // count값과 입력받은 number가 같으면 그 때의 666이 들어간 수를 반환한다.

        while (count != number) {
            targetNumber++;
            if (String.valueOf(targetNumber).contains("666")) {
                count++;
            }
        }

        bw.write(String.valueOf(targetNumber));
        bw.flush();

        br.close();
        bw.close();
    }
}
