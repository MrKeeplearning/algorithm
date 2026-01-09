package dsa.ch01_dsa_tutorial.fibonacci;

import java.io.*;

public class implRecursiveFibonacciV1 {
    private static int count = 2;
    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        int a = 0;
        int b = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(a + "\n" + b + "\n");
        recursiveFibonacci(a, b);
        bw.flush();

        br.close();
        bw.close();
    }

    public static void recursiveFibonacci(int prev1, int prev2) throws IOException {
        while (count <= 19) {
            int next = prev1 + prev2;
            bw.write(next + "\n");
            prev1 = prev2;
            prev2 = next;
            count++;
            recursiveFibonacci(prev1, prev2);
        }
    }
}
