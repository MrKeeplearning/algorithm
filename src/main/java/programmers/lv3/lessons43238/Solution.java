package programmers.lv3.lessons43238;

import java.util.Arrays;

public class Solution {
    /**
     * 1. 초기 검색 범위를 설정한다. 최소 시간은 1분(가장 빠른 심사관에게 검사를 받아도 걸리는 시간)이며, 최대 시간은 가장 오래 걸리는 심사관에게 모든 사람이 검사를 받는데 걸리는 시간이다.
     * <p>
     * 2. 이후 중앙값을 계산하고, 모든 심사관이 중앙값 시간 동안 검사할 수 있는 사람의 수를 계산한다.
     * <p>
     * 3. 계산한 심사관들의 범위가 n명을 넘는다면, right를 mid로 변경한다.
     * <p>
     * 4. 계산한 심사관들의 범위가 n명이 안 된다면, left를 mid + 1로 변경한다.
     * <p>
     * 5. 이후 위의 과정들을 범위가 좁혀질 때까지 반복한다.
     */
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long left = 0;
        long right = (long) n * (long) times[times.length - 1];
        long mid = 0;
        // sum 변수는 가장 빠른 시간 안에 처리할 수 있는 최대 사람 수를 구하는 것.
        // 즉, sum은 mid라는 시간 동안 각 심사관이 얼마나 많은 사람을 처리할 수 있는지를 합산한 결과이다.
        // 예를 들어, 주어진 시간 mid가 24분이고 한 심사관이 1명을 심사하는데 2분이 소요되고,
        // 다른 심사관이 1명을 심사하는데 3분이 걸린다고 가정해보자.
        // 이 경우, 첫 심사관은 24분 동안 12명을, 두 번째 심사관은 24분 동안 8명을 심사할 수 있다.
        // 이 둘을 합치면 20명을 심사할 수 있다.
        // 즉, sum은 mid 시간 동안 모든 심사관들이 다함께 심사할 수 있는 최대 인원의 수를 나타낸다.
        // 심사 받아야 할 전체 사람의 수인 n과 sum을 비교해서 mid 시간 안에
        // n명의 사람들이 심사를 받을 수 있는지를 결정할 수 있다.
        // 만약 sum이 n보다 크거나 같다면, 해당 시간 동안 모든 사람이 심사를 받을 수 있다는 뜻이다!
        // 따라서, 오른쪽 범위를 줄여서 가장 최소의 시간을 찾아낸다.
        long sum = 0;
        long answer = Long.MAX_VALUE;

        while (left <= right) {
            sum = 0;    // 루프를 돌 때마다 sum 초기화
            mid = (left + right) / 2;
            for (int time : times) {
                sum += mid / time;
            }

            // sum 시간 동안 모든 사람이 심사를 받을 수 있다.
            // 따라서 오른쪽 범위를 줄여서 가장 최소의 시간을 찾아내자.
            if (sum >= n) {
                if (mid < answer) {
                    answer = mid;
                }
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
}