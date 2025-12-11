package baekjoon.season01.problem3003;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] pieces = {1, 1, 2, 2, 2, 8};
        ArrayList<Integer> dh = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            dh.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < pieces.length; i++) {
            int result = pieces[i] - dh.get(i);
            sb.append(result).append(" ");
        }
        bw.write(sb.toString().trim());

        br.close();
        bw.close();
    }
}
