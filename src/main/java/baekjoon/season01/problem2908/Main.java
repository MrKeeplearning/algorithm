package baekjoon.season01.problem2908;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String numbersOnBlackboard = br.readLine();
            StringTokenizer st = new StringTokenizer(numbersOnBlackboard);

            String reversedFirstNumber = new StringBuilder(st.nextToken()).reverse().toString();
            String reversedSecondNumber = new StringBuilder(st.nextToken()).reverse().toString();

            int firstNumber = Integer.parseInt(reversedFirstNumber);
            int secondNumber = Integer.parseInt(reversedSecondNumber);

            int max = Math.max(firstNumber, secondNumber);

            bw.write(String.valueOf(max));
            bw.flush();

            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
