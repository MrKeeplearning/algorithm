package baekjoon.season01.problems.problem2577;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10];
        int number = 1;
        for (int i = 0; i < 3; i++) {
            number *= Integer.parseInt(br.readLine());
        }

        for (char c : String.valueOf(number).toCharArray()) {
            arr[c - '0']++;
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(String.valueOf(arr[i]));
            if (i != arr.length - 1) {
                bw.newLine();
            }
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
