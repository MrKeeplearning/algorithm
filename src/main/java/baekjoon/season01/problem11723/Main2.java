package baekjoon.season01.problem11723;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        boolean[] S = new boolean[21];

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String operation = st.nextToken();

            int x = 0;
            if (st.hasMoreTokens()) {
                x = Integer.parseInt(st.nextToken());   // add, remove, check, toggle은 숫자 x를 받아야 한다.
            }

            switch (operation) {
                case "add":
                    S[x] = true;
                    break;
                case "remove":
                    S[x] = false;
                    break;
                case "check":
                    if (S[x])
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case "toggle":
                    S[x] = !S[x];
                    break;
                case "all":
                    Arrays.fill(S, true);
                    break;
                case "empty":
                    Arrays.fill(S, false);
                    break;
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
