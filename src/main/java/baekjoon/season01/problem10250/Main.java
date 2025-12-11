package baekjoon.season01.problem10250;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());   // 호텔의 층수
            int W = Integer.parseInt(st.nextToken());   // 한 층당 객실의 수
            int N = Integer.parseInt(st.nextToken());   // N번째 손님

            int floor = N % H;      // N번째 손님에게 배정될 층
            int room = N / H + 1;   // N번째 손님에게 배정될 방 번호
            if (floor == 0) {       // N과 H가 동일한 경우
                floor = H;
                room -= 1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(floor);
            if (room < 10) {
                sb.append("0");
            }
            sb.append(room);
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
