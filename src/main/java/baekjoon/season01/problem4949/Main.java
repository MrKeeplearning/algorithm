package baekjoon.season01.problem4949;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;

        while (true) {
            line = br.readLine();
            if (line.equals(".")) {
                break;
            }
            bw.write(isBalanced(line) ? "yes\n" : "no\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean isBalanced(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[') {
                deque.push(c);
            } else if (c == ')') {
                if (deque.isEmpty() || deque.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (deque.isEmpty() || deque.pop() != '[') {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
