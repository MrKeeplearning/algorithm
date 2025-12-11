package baekjoon.season01.problem1259;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();
            if (line.equals("0")) {
                break;
            }
            if (isPalindrome(line)) {
                bw.write("yes");
                bw.newLine();
            } else {
                bw.write("no");
                bw.newLine();
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }

    public static boolean isPalindrome(String s) {
        int forward = 0;
        int backward = s.length() - 1;
        while (backward > forward) {
            char forwardChar = s.charAt(forward++); // forward 인덱스를 먼저 읽고 그 다음에 1증가시킴(후위 증가 연산자)
            char backwardChar = s.charAt(backward--);
            if (forwardChar != backwardChar) {
                return false;
            }
        }
        return true;
    }
}
