package baekjoon.problem28278;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());

            switch(n1) {
                case 1 :
                    int n2 = Integer.parseInt(st.nextToken());
                    pushX(deque, n2);
                    break;
                case 2 :
                    bw.write(popX(deque) + "\n");
                    break;
                case 3 :
                    bw.write(sizeOfStack(deque) + "\n");
                    break;
                case 4 :
                    bw.write(isStackEmpty(deque) + "\n");
                    break;
                case 5 :
                    bw.write(peekX(deque) + "\n");
                    break;
            }
        }
        br.close();
        bw.close();
    }

    // 1.
    public static void pushX(Deque<Integer> deque, int x) {
        deque.push(x);
    }

    // 2.
    public static int popX(Deque<Integer> deque) {
        return !deque.isEmpty() ? deque.pop() : -1;
    }

    // 3.
    public static int sizeOfStack(Deque<Integer> deque) {
        return deque.size();
    }

    // 4.
    public static int isStackEmpty(Deque<Integer> deque) {
        return deque.isEmpty() ? 1 : 0;
    }

    // 5.
    public static int peekX(Deque<Integer> deque) {
        return !deque.isEmpty() ? deque.peek() : -1;
    }
}
