package baekjoon.problem1422;

import java.io.*;
import java.util.*;

public class Main {
    static int k, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());   // 주어진 숫자의 개수
        n = Integer.parseInt(st.nextToken());   // 만들어야 하는 숫자의 길이
        PriorityQueue<String> pq = new PriorityQueue<>((o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 입력받은 숫자들을 저장한다.
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            numbers.add(br.readLine());
        }

        backtrack(numbers, "", n, pq);
        bw.write(String.valueOf(pq.poll()));

        br.close();
        bw.close();
    }

    private static void backtrack(ArrayList<String> numbers, String current, int n, PriorityQueue<Integer> pq) {
        // 종료 조건
        if (current.length() == n) {
            pq.offer(Integer.parseInt(current));
            return;
        }

        for (int i = 0; i < numbers.size(); i++) {
            String next = current + numbers.get(i);
            backtrack(numbers, next, n, pq);
        }
    }
}
