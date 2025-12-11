package baekjoon.season01.problem2525;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int cookingTime = Integer.parseInt(br.readLine());

        if ((minute + cookingTime) / 60 > 0) {
            hour = (hour + (minute + cookingTime) / 60) % 24;
        }
        minute = (minute + cookingTime) % 60;

        bw.write(hour + " " + minute);

        br.close();
        bw.close();
    }
}
