package baekjoon.problem1065;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count;
        int answer;
        int number = Integer.parseInt(br.readLine());

        // 99까지는 모두 한수에 해당된다.
        if (number < 100) {
            answer = number;
        } else {
            // 100이상인 수라면 99까지는 모두 한수이기 때문에 count 값을 99부터 시작한다.
            count = 99;
            for (int i = 100; i <= number; i++) {
                if (isArithmeticSequence(i)) {
                    count++;
                }
            }
            answer = count;
        }
        bw.write(String.valueOf(answer));
        bw.close();
        br.close();
    }


    public static boolean isArithmeticSequence(int number) {
        String strNum = Integer.toString(number);
        int len = strNum.length();
        int[] digits = new int[len];

        // 각 자리수를 배열에 저장한다.
        for (int i = 0; i < len; i++) {
            // 유니코드 값의 차이를 활용해서 실제 숫자를 각 배열의 자리에 삽입
            digits[i] = strNum.charAt(i) - '0';
        }

        // 자리수를 순서대로 비교
        int diff = digits[1] - digits[0];
        for (int i = 1; i < len - 1; i++) {
            if (digits[i + 1] - digits[i] != diff) {
                return false;
            }
        }
        return true;
    }
}