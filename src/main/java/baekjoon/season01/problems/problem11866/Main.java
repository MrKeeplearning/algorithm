package baekjoon.season01.problems.problem11866;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        LinkedList<Integer> people = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        StringBuilder result = new StringBuilder();
        result.append("<");

        int index = 0;
        while (!people.isEmpty()) {
            index = (index + (K-1)) % people.size();
            result.append(people.remove(index));
            if (!people.isEmpty()) {
                result.append(", ");
            }
        }
        result.append(">");

        bw.write(result.toString());
        br.close();
        bw.close();
    }
}
