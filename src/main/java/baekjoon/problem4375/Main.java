package baekjoon.problem4375;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null) {
            long n = Long.parseLong(line);

            if (n == 1) {
                bw.write("1\n");
                continue;
            }

            long number = 1;
            int cnt = 1;

            while (number % n != 0) {
                number = (number * (10 % n) + 1%n) % n;
                cnt++;
            }

            bw.write(cnt + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
