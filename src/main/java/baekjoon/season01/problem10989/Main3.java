package baekjoon.season01.problem10989;

import java.io.*;

/**
 * Map과 같은 구조로 구현한 풀이
 * 메모리 : 301488 KB
 * 시간 : 1248 ms
 */
public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = new int[10001];
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                bw.write((i + "\n").repeat(nums[i]));
            }
        }

        br.close();
        bw.close();
    }
}
