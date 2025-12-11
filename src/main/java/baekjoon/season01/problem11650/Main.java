package baekjoon.season01.problem11650;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] onlyX = new int[N];
        HashMap<Integer, PriorityQueue<Integer>> numMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (!numMap.containsKey(x)) {
                numMap.put(x, new PriorityQueue<>());
            }
            numMap.get(x).add(y);
            onlyX[i] = x;
        }

        Arrays.sort(onlyX);

        for (int i = 0; i < N; i++) {
            bw.write(onlyX[i] + " ");
            int yCoordinate = numMap.get(onlyX[i]).remove();
            bw.write(yCoordinate + "\n");
        }

        br.close();
        bw.close();
    }
}
