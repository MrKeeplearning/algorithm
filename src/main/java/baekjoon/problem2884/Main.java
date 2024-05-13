package baekjoon.problem2884;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute < 45) {
            hour = (hour - 1 + 24) % 24;
            minute += 60;
        }
        minute -= 45;

        bw.write(hour + " " + minute);

        br.close();
        bw.close();
    }
}
