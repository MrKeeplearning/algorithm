package baekjoon.season01.problems.problem4673;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 0부터 10000까지 인덱스를 가지는 공간을 만든다.
        boolean[] isNotSelfNumber = new boolean[10001];

        // kaprekar 함수를 1부터 10000까지 모든 수에 대해 실행하면서
        // kaprekar 함수의 결과값에 해당되는 인덱스의 배열 요소를 true로 설정한다.
        for (int i = 1; i < 10001; i++) {
            int num = kaprekar(i);
            if (num <= 10000) {
                isNotSelfNumber[num] = true;
            }
        }

        for (int i = 1; i < isNotSelfNumber.length; i++) {
            if (!isNotSelfNumber[i]) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.close();
    }

    public static int kaprekar(int number) {
        int sum = number;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
