package dsa.ch01_dsa_tutorial.fibonacci;

import java.io.*;
import java.util.*;

public class implRecursiveFibonacciV2 {

    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(F(0) + "\n");
        bw.write(F(1) + "\n");

        for (int i = 2; i <= 19; i++) {
            bw.write(F(i) + "\n");
        }

        br.close();
        bw.close();
    }

    public static int F(int n) throws IOException {
        if (n <= 1) {
            return n;
        } else {
            return F(n - 1) + F(n - 2);
        }
    }
}
