package baekjoon.season01.problems.problem2588;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstNumber = Integer.parseInt(br.readLine());
        String secondNumber = br.readLine();
        char[] arr = secondNumber.toCharArray();

        // 3, 4, 5에 들어갈 값
        for (int i = arr.length - 1; i >= 0; i--) {
            bw.write(String.valueOf(firstNumber * Integer.parseInt(String.valueOf(arr[i]))));
            bw.write("\n");
        }

        // 6에 들어갈 값
        int ans6 = firstNumber * Integer.parseInt(secondNumber);
        bw.write(String.valueOf(ans6));

        br.close();
        bw.close();
    }
}
