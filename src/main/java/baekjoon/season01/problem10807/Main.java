package baekjoon.season01.problem10807;

import java.util.*;
import java.io.*;

public class Main {
    static int N, answer;
    static String line, v;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        line = br.readLine();
        v = br.readLine();

        StringTokenizer st = new StringTokenizer(line);
        while (st.hasMoreTokens()) {
            if (st.nextToken().equals(v)) {
                answer++;
            }
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
