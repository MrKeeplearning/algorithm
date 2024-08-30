package baekjoon.problem10815;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 상근이가 가진 숫자를 Map에 Key로 담아서 O(1)의 시간복잡도로 탐색할 수 있게 한다.
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> sanggeun = new HashMap<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sanggeun.put(Integer.parseInt(st1.nextToken()), 1);
        }

        // 상근이가 가진 숫자인지 아닌지 확인
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (sanggeun.containsKey(Integer.parseInt(st2.nextToken()))) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
