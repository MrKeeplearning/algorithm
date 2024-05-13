package baekjoon.problem1253;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 첫 줄 입력
        int[] nums = new int[N];    // 두 번째 줄 입력을 담을 배열
        int count = 0;

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                int sum = nums[i] + nums[j];
                if (contains(nums, sum)) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static boolean contains(int[] array, int num) {
        for (int elem : array) {
            if (elem == num) {
                return true;
            }
        }
        return false;
    }
}
