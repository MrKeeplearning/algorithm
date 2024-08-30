package baekjoon.problem11478;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();

        String targetString = br.readLine();
        int targetLength = targetString.length();

        for (int i = 1; i <= targetLength; i++) {
            for (int j = 0; j <= targetLength - i; j++) {
                set.add(targetString.substring(j, j + i));
            }
        }
        bw.write(String.valueOf(set.size()));

        br.close();
        bw.close();
    }
}
