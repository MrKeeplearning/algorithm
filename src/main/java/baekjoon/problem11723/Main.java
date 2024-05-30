package baekjoon.problem11723;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        Set<String> S = new TreeSet<>();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String operation = st.nextToken();
            String number = null;

            if (st.hasMoreTokens()) {
                number = st.nextToken();    // add, remove, check, toggle은 숫자 x를 받아야 한다.
            }

            switch (operation) {
                case "add":
                    add(S, number);
                    break;
                case "remove":
                    remove(S, number);
                    break;
                case "check":
                    String check = check(S, number);
                    bw.write(check);
                    bw.newLine();
                    break;
                case "toggle":
                    toggle(S, number);
                    break;
                case "all":
                    all(S);
                    break;
                case "empty":
                    empty(S);
                    break;
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }

    public static void add(Set<String> S, String value) {
        S.add(value);
    }

    public static void remove(Set<String> S, String value) {
        S.remove(value);
    }

    public static String check(Set<String> S, String value) {
        if (S.contains(value)) {
            return "1";
        } else {
            return "0";
        }
    }

    public static void toggle(Set<String> S, String value) {
        if (!S.remove(value)) {
            S.add(value);
        }
    }

    public static void all(Set<String> S) {
        for (int i = 1; i <= 20; i++) {
            S.add(String.valueOf(i));
        }
    }

    public static void empty(Set<String> S) {
        S.clear();
    }
}
