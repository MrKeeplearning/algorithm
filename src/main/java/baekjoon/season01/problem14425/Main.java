package baekjoon.season01.problem14425;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<String> setS = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            setS.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            if (setS.contains(br.readLine())) {
                count++;
            }
        }
        bw.write(String.valueOf(count));

        br.close();
        bw.close();
    }
}
