package baekjoon.problem10989;

import java.util.*;
import java.io.*;

/**
 * 메모리 : 362820 KB
 * 시간 : 2348 ms
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);

        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num).append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
