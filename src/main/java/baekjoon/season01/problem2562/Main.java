package baekjoon.season01.problem2562;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int max = Collections.max(list);
        int index = list.indexOf(max) + 1;

        bw.write(max + "\n" + index);

        br.close();
        bw.close();
    }
}
