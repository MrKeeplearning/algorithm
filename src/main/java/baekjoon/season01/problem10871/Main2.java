package baekjoon.season01.problem10871;

import java.util.*;

/**
 * 메모리: 29752 KB
 * 시간: 388 ms
 */
public class Main2 {
    static int N, X;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        X = scan.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int num = scan.nextInt();
            if (num < X) {
                sb.append(num).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
