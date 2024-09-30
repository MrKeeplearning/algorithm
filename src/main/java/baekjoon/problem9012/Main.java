package baekjoon.problem9012;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (isVPS(line)) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        br.close();
        bw.close();
    }

    // VPS가 맞다면 true, 아니라면 false를 반환한다.
    // Deque에 '('를 만났을 때 push하고, ')'를 만났을 때 pop한다면
    // VPS일 때는 Deque이 최종적으로 비어있어야 한다.
    public static boolean isVPS(String line) {
        Deque<Character> PS = new ArrayDeque<>();
        for (int i = 0; i < line.length(); i++) {
            char parenthesis = line.charAt(i);
            if (parenthesis == '(') {
                PS.push(parenthesis);
            } else if (PS.isEmpty()) {
                return false;
            } else {
                PS.pop();
            }
        }
        return PS.isEmpty();
    }
}
