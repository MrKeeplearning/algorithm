package baekjoon.season01.problem3009;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> mapX = new HashMap<>();
        HashMap<Integer, Integer> mapY = new HashMap<>();
        int ansX = 0;
        int ansY = 0;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            mapX.put(x, mapX.getOrDefault(x, 0) + 1);
            mapY.put(y, mapY.getOrDefault(y, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mapX.entrySet()) {
            if (entry.getValue() == 1) {
                ansX = entry.getKey();
                break;
            }
        }

        for (Map.Entry<Integer, Integer> entry : mapY.entrySet()) {
            if (entry.getValue() == 1) {
                ansY = entry.getKey();
                break;
            }
        }

        bw.write(ansX + " " + ansY + "\n");

        br.close();
        bw.close();
    }
}
