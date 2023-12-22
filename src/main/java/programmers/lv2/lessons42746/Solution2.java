package programmers.lv2.lessons42746;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        String solution = solution(numbers);
        System.out.println(solution);
    }
    public static String solution(int[] numbers) {
        List<String> temp = new ArrayList<>();
        List<Integer> permutationList = new ArrayList<>();
        boolean[] visited = new boolean[numbers.length];

        permutation(numbers, temp, visited, permutationList);
        Collections.sort(permutationList, Collections.reverseOrder());

        Integer answer = permutationList.get(0);
        return String.valueOf(answer);
    }

    public static void permutation(int[] numbers, List<String> temp, boolean[] visited, List<Integer> permutationList) {
        StringBuilder sb = new StringBuilder();

        if (temp.size() == numbers.length) {
            for (String s : temp) {
                sb.append(s);
            }
            permutationList.add(Integer.valueOf(sb.toString()));
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.add(String.valueOf(numbers[i]));
                permutation(numbers, temp, visited, permutationList);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}