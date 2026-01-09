package dsa.ch01_dsa_tutorial.fibonacci;

import java.io.*;

public class implFibonacci {
    public static void main(String[] args) {
        try {
            forLoopSolution();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void forLoopSolution() throws IOException {

        int a = 0;
        int b = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(a + "\n");
        bw.write(b + "\n");

        for (int i = 0; i < 18; i++) {
            int tmp = b;
            b = a + b;
            a = tmp;
            bw.write(b + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
