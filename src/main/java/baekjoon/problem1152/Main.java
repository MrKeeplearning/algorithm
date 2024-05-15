package baekjoon.problem1152;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(inputString);
        bw.write(String.valueOf(st.countTokens()));
        bw.flush();

        br.close();
        bw.close();
    }
}
