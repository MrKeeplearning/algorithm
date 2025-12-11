package baekjoon.season01.problems.problem12789;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 학생 수
        int[] students = new int[N]; // 학생 번호
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            students[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>(); // 임시 스택
        int current = 1; // 현재 받아야 하는 번호표

        for (int i = 0; i < N; i++) {
            // 스택에 쌓여 있는 학생들 중에서 간식을 받을 순서에 맞는 학생이 있을 수 있다.
            // 현재 간식을 받을 순서와 스택에 있는 학생이 일치하면 계속해서 해당 학생들에게 간식을 줘야 하기 때문에 반복 처리가 필요.
            // 스택의 최상단에 있는 학생이 순서에 맞을 때까지 계속 간식을 주고, 순서가 맞지 않는 학생이 나올 때까지 반복한다.
            while (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();    // 현재 순서에 맞는 학생이 스택에 있다면 간식을 주고 스택에서 꺼냄
                current++;      // 다음 간식 받을 순서로 넘어감
            }
            // 일반 대기열에 있는 학생 중 현재 받아야 하는 번호표와 동일하다면 stack에 넣지 않고 바로 간식 제공
            if (students[i] == current) {
                current++;
            } else {
                // 일반 대기열에 있는 학생 중 현재 받아야 하는 번호표와 다르다면 stack에 임시 보관
                stack.push(students[i]);
            }
        }

        // 스택에서 남은 학생들이 간식을 받을 수 있는지를 확인하고, 남은 순서를 처리하는 마지막 단계
        while (!stack.isEmpty() && stack.peek() == current) {
            stack.pop();
            current++;
        }

        if (stack.isEmpty()) {
            bw.write("Nice\n");
        } else {
            bw.write("Sad\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
